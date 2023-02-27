package com.study.dao;

import com.study.config.Config;
import com.study.entity.Person;
import com.study.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhutongtong
 * @date 2023/2/23 13:40
 */
public class UserDaoTest {

	/**
	 * 事务异常demo
	 */
	@Test
	void test(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		UserDao userDao = context.getBean(UserDao.class);
		User byId = userDao.getById(1);

		User user = new User();
		user.setName("小张");
		user.setEmail("qq.com");
		user.setId(22);
		userDao.insertUser(user);
	}
}
