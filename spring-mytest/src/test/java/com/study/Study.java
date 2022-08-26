package com.study;

import com.study.config.Config;
import com.study.entity.Person;
import com.study.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhutongtong
 * @date 2022/6/24 18:08
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Config.class)
public class Study {

//	@Resource
//	Person person;
//	@Resource
//	UserDao userDao;


	@Test
	void test2(){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Person person = context.getBean("person", Person.class);

		String name = person.getName();
		System.out.println(name);
//		UserDao userDao = context.getBean(UserDao.class);
//		User byId = userDao.getById(1);

		User user = new User();
		user.setName("小张");
		user.setEmail("qq.com");
		user.setId(4);
//		userDao.insertUser(user);

		System.out.println();

		System.out.println("123");
		System.out.println("7894561235");
	}

	@Test
	void test3(){
		System.out.println("test33");
	}

	public static void main(String[] args) {
		System.out.println("test33");
	}
}
