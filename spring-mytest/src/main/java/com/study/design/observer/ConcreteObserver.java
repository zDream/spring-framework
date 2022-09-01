package com.study.design.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * @Author gaotian
 * @Description
 * 具体观察者中会维护一个指向具体目标对象的引用，它存储了具体观察者的状态，这些状态和具体目标的状态要保持一致。
 *
 * 它实现了抽象观察者对象的updata方法。
 *
 * 通常在实现时，可以调用具体目标的attach和detach方法将自己加入到集合中或者从集合中剔除。
 * @Date 9:06 2020/6/23
 **/
public class ConcreteObserver implements Observer {
	private String observerName;
	public ConcreteObserver(String observerName) {
		this.observerName = observerName;
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(observerName + "我要更新一下我的状态了......");
		System.out.println("目标类为：" + o);
		System.out.println("参数为 = " + arg);
	}
}