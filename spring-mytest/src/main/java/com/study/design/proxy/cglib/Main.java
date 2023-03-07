package com.study.design.proxy.cglib;

import com.study.design.proxy.statice.StudentService;
import com.study.design.proxy.statice.StudentServiceImpl;

/**
 * @author zhutongtong
 * @date 2023/3/6 13:48
 */
public class Main {
	public static void main(String[] args) {
		CGLibProxy cgLibProxy = new CGLibProxy();
		StudentServiceImpl studentService = (StudentServiceImpl)cgLibProxy.bind(new StudentServiceImpl());
		studentService.addStudent();
	}

}
