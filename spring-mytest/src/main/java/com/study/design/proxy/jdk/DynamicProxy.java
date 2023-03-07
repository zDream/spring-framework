package com.study.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhutongtong
 * @date 2023/3/6 13:38
 */
public class DynamicProxy implements InvocationHandler {


	private Object target; // 目标对象

	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(target, args);
		System.out.println("拿个小本本记录一下");
		return result;
	}
}
