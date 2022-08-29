package com.study.design.factory.simple;

import org.testng.annotations.Test;

/**
 * 策略模式代码
 * @author zhutongtong
 * @date 2022/8/26 10:55
 */
public class StrategySign {

	private People people;

	public StrategySign(People people){
		this.people = people;
	}

	public StrategySign(String name){
		if(name.equals("Xiaoming")){
			this.people = new Xiaoming();
		}else if(name.equals("Xiaohong")){
			this.people = new Xiaohong();
		}
	}

	public void run(){
		people.run();
	}


	@Test
	public void testSign(){
		PeopleFactory peopleFactory = new PeopleFactory();
		People people = peopleFactory.getPeople("Xiaohong");
		System.out.print("工厂模式-------------"); people.eat();
		System.out.print("工厂模式-------------"); people.run();
		System.out.print("工厂模式-------------"); people.eat();
		StrategySign strategySign = new StrategySign("Xiaohong");
		System.out.print("策略模式-------------");strategySign.run();
	}
}

