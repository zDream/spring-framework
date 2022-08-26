package com.study.design.strategy;

import java.util.List;

/**
 * @author zhutongtong
 * @date 2022/8/25 15:41
 */
public interface PermissionStrategyService {

	/**
	 * 权限列表
	 * @return
	 */
	List<Integer> permissionList(Permission permission);
}
