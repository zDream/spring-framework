package com.study.design.factory.simple;

/**
 * @author zhutongtong
 * @date 2022/8/26 10:53
 */
public class Xiaoming implements People{

	@Override
	public void eat() {
		System.out.println("小明吃饭");
	}

	@Override
	public void run() {
		System.out.println("小明跑步");
	}

	@Override
	public void wear() {
		System.out.println("小明穿衣");
	}
}
