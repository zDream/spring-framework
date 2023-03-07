package com.study.design.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhutongtong
 * @date 2023/3/6 13:46
 */
public class CGLibProxy implements MethodInterceptor {

	private Object target; // 目标对象
	public Object bind(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		//设置父类
		enhancer.setSuperclass(this.target.getClass());
		//设置回调函数
		enhancer.setCallback(this);
		//创建子类(代理对象)
		return enhancer.create();
	}
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		Object result = methodProxy.invokeSuper(obj, args);
		System.out.println("拿个小本本记录一下");
		return result;
	}
}
