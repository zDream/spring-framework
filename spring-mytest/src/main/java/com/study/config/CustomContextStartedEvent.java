package com.study.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @author zhutongtong
 * @date 2023/2/27 15:00
 */
@Component
public class CustomContextStartedEvent extends ContextStartedEvent {
	private static final long serialVersionUID = -3947926288225940587L;

	/**
	 * Create a new ContextStartedEvent.
	 *
	 * @param source the {@code ApplicationContext} that has been started
	 *               (must not be {@code null})
	 */
	public CustomContextStartedEvent(ApplicationContext source) {
		super(source);
		System.out.println("上下文开始事件（ContextStartedEvent）：当容器调用ConfigurableApplicationContext的Start()方法开始/重新开始容器时触发该事件。");
	}
}
