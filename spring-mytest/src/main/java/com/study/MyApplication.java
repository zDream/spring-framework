package com.study;

import com.study.config.Config;
import com.study.dao.UserDao;
import com.study.design.strategy.Permission;
import com.study.design.strategy.PermissionStrategyService;
import com.study.design.strategy.StrategyContext;
import com.study.entity.Person;
import com.study.entity.User;
import com.study.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhutongtong
 * @date 2022/6/22 16:24
 */
public class MyApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Person person = context.getBean("person", Person.class);


		UserDao userDao = context.getBean(UserDao.class);
		User byId = userDao.getById(1);

		User user = new User();
		user.setName("小张");
		user.setEmail("qq.com");
		user.setId(4);
//		userDao.insertUser(user);

		UserService bean = context.getBean(UserService.class);
		bean.method();


	}


}
