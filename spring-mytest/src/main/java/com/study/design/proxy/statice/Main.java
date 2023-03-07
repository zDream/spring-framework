package com.study.design.proxy.statice;

/**
 * @author zhutongtong
 * @date 2023/3/6 11:59
 */
public class Main {
	public static void main(String[] args) {
		StudentStaticProxy studentStaticProxy = new StudentStaticProxy(new StudentServiceImpl());
		studentStaticProxy.addStudent();
	}
}
