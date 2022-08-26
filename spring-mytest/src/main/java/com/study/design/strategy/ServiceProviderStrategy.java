package com.study.design.strategy;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhutongtong
 * @date 2022/8/25 15:44
 */
@Component
public class ServiceProviderStrategy implements PermissionStrategyService{
	@Override
	public List<Integer> permissionList(Permission permission) {
		System.out.println("服务商权限列表");
		return null;
	}
}
