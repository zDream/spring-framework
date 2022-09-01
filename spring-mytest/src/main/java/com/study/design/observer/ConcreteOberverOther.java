package com.study.design.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * @Author gaotian
 * @Description 第二个具体的观察者，测试是否能够同时收到消息并更新状态
 * @Date 9:09 2020/6/23
 **/
public class ConcreteOberverOther implements Observer
{
	private String observerName;
	public ConcreteOberverOther(String observerName)
	{
		this.observerName = observerName;
	}
	@Override
	public void update(Observable o, Object arg)
	{
		System.out.println(observerName + "我要更新一下我的状态了......");
		System.out.println("目标类为：" + o);
		System.out.println("参数为 = " + arg);
	}
}