package com.study.design.proxy.jdk;

import com.study.design.proxy.statice.StudentService;
import com.study.design.proxy.statice.StudentServiceImpl;

/**
 * @author zhutongtong
 * @date 2023/3/6 13:41
 */
public class Main {
	public static void main(String[] args) {
		DynamicProxy dynamicProxy = new DynamicProxy();
		StudentService studentService = (StudentService)dynamicProxy.bind(new StudentServiceImpl());
		studentService.addStudent();
	}
}
