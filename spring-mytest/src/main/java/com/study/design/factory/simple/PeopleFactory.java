package com.study.design.factory.simple;

/**
 * @author zhutongtong 工厂模式代码
 * @date 2022/8/26 10:54
 */
public class PeopleFactory {
	public People getPeople(String name){
		if(name.equals("Xiaoming")){
			return new Xiaoming();
		}else if(name.equals("Xiaohong")){
			return new Xiaohong();
		}
		return null;
	}
}
