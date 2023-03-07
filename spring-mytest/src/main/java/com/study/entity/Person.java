package com.study.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhutongtong
 * @date 2022/6/22 16:23
 */
@Configuration
public class Person implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean , DisposableBean {
	private Integer id = 2;
	private String name = "name";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Person name="+name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory方法="+beanFactory.isSingleton("person"));
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext方法="+applicationContext.getApplicationName());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory()");
	}

	@PostConstruct
	public void init() {
		System.out.println("init person()");
		// Invoked after dependencies injected
	}

	// ...


//	@Override
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("postProcessBeforeInitialization()="+beanName);
//		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
//	}
//
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("postProcessAfterInitialization()="+beanName);
//		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
//	}
}
