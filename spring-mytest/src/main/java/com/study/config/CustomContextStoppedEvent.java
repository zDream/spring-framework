package com.study.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * @author zhutongtong
 * @date 2023/2/27 15:36
 */
@Component
public class CustomContextStoppedEvent extends ContextStoppedEvent {

	private static final long serialVersionUID = -3947926288225940587L;

	/**
	 * Create a new ContextStoppedEvent.
	 *
	 * @param source the {@code ApplicationContext} that has been stopped
	 *               (must not be {@code null})
	 */
	public CustomContextStoppedEvent(ApplicationContext source) {
		super(source);
		System.out.println("上下文停止事件（ContextStoppedEvent）：当容器调用ConfigurableApplicationContext的Stop()方法停止容器时触发该事件");
	}
}
