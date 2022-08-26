package com.study.design.strategy;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhutongtong
 * @date 2022/8/25 15:43
 */
@Component
public class BankStrategy implements PermissionStrategyService {
	@Override
	public List<Integer> permissionList(Permission permission) {
		System.out.println("银行权限列表");
		return null;
	}
}
