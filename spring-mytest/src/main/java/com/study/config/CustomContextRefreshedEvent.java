package com.study.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * ContextRefreshedEvent
 * 上下文更新事件（ContextRefreshedEvent）：在调用ConfigurableApplicationContext 接口中的refresh()方法时被触发
 * @author zhutongtong
 * @date 2023/2/27 14:55
 */
@Component
public class CustomContextRefreshedEvent extends ContextRefreshedEvent {

	private static final long serialVersionUID = -3947926288225940587L;


	/**
	 * Create a new ContextRefreshedEvent.
	 *
	 * @param source the {@code ApplicationContext} that has been initialized
	 *               or refreshed (must not be {@code null})
	 */
	public CustomContextRefreshedEvent(ApplicationContext source) {
		super(source);
		System.out.println("上下文更新事件（ContextRefreshedEvent）,在调用ConfigurableApplicationContext 接口中的refresh()方法时被触发");
	}
}
