package com.study.design.factory.simple;

/**
 * @author zhutongtong
 * @date 2022/8/26 10:53
 */
public class Xiaohong implements People{

	@Override
	public void eat() {
		System.out.println("小红吃饭");
	}

	@Override
	public void run() {
		System.out.println("小红跑步");
	}

	@Override
	public void wear() {
		System.out.println("小红穿衣");
	}
}
