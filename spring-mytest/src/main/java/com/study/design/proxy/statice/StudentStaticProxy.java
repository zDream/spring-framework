package com.study.design.proxy.statice;

/**
 * 静态代理
 * @author zhutongtong
 * @date 2023/3/6 11:56
 */
public class StudentStaticProxy implements StudentService{

	private StudentService studentService;
	public StudentStaticProxy(StudentService studentService){
		this.studentService = studentService;
	}

	@Override
	public void addStudent() {
		studentService.addStudent();
		System.out.println("这里添加了代理的方法");
	}
}
