package com.study.design.strategy;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhutongtong
 * @date 2022/8/25 15:45
 */
@Service
public class StrategyContext {

	private final Map<String, PermissionStrategyService> orderStrategyMap = new ConcurrentHashMap<>();

	public StrategyContext(Map<String, PermissionStrategyService> strategyMap) {
		this.orderStrategyMap.clear();
		strategyMap.forEach((k, v)-> this.orderStrategyMap.put(k, v));
	}

	/**
	 * 策略模式启动
	 * @param permission
	 * @return
	 */
	public PermissionStrategyService getPermissionList(Permission permission){
		return orderStrategyMap.get(permission.getPermissionName());
	}
}
