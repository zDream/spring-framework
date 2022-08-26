package com.study.design.strategy;

import com.study.config.Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhutongtong
 * @date 2022/8/26 10:34
 */
class StrategyContextTest {

	@Test
	void getPermissionList() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		StrategyContext strategyContext = context.getBean(StrategyContext.class);
		Permission permission = new Permission();
		permission.setPermissionName("bankStrategy");
		PermissionStrategyService permissionList = strategyContext.getPermissionList(permission);
		permissionList.permissionList(new Permission());
	}
}