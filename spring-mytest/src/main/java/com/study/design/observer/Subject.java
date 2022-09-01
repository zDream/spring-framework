package com.study.design.observer;

import java.util.Observable;

/**
 * @Author gaotian
 * @Description 具体目标类 Subject 继承抽象类并实现通知观察者的方法
 * 它拥有自己的状态，当它的状态的改变时就会通知各个观察者。
 * @Date 9:01 2020/6/23
 **/
public class Subject extends Observable {
/**
 * Observable 它是指被观察的对象。我们在主题中定义一个观察者集合。
 * 一个观察者对象可以接收任意多个观察者。同时提供了一系列的方法管理这些观察者。
 **/
	/**
	 * @Author gaotian
	 * @Description //开启改变状态
	 * @Date 15:45 2020/6/23
	 **/
	@Override
	protected synchronized void setChanged()
	{
		super.setChanged();
	}
}