package com.study.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * @author zhutongtong
 * @date 2023/2/27 15:38
 */
@Component
public class CustomContextClosedEvent extends ContextClosedEvent {
	private static final long serialVersionUID = -3947926288225940587L;

	/**
	 * Creates a new ContextClosedEvent.
	 *
	 * @param source the {@code ApplicationContext} that has been closed
	 *               (must not be {@code null})
	 */
	public CustomContextClosedEvent(ApplicationContext source) {
		super(source);
		System.out.println("上下文关闭事件（ContextClosedEvent）：当ApplicationContext被关闭时触发该事件。容器被关闭时，其管理的所有单例Bean都被销毁。");
	}
}
