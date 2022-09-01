package com.study.design.observer;

/**
 * @author zhutongtong
 * @date 2022/8/31 11:22
 */
import java.util.Observer;
public class NotifyMain {
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.setChanged();
		Observer observer = new ConcreteObserver("观察者一号");
		Observer observer2 = new ConcreteOberverOther("观察者二号");
//将观察者都加入观察者列表中
		subject.addObserver(observer);
		subject.addObserver(observer2);
//通知观察者
		boolean hasChanged = subject.hasChanged();
		System.out.println("hasChanged = " + hasChanged);
		subject.notifyObservers("123");

	}

}

/**
 * 1.主要优点
 *
 * （1）观察者模式可以实现表示层和数据逻辑层的分离，定义了稳定的消息传递机制，并抽象了更新接口，使得可以有各种各样的表示层充当具体的观察者角色。
 *
 * （2）观察者模式在观察目标和观察者之间建立一个抽象的耦合。观察者对象只需要维持一个抽象观察者的集合，无需了解其具体观察者。
 *
 * （3）观察者模式支持广播通信，观察目标会向所有已注册的观察者发送通知，降低了一对多系统的设计难度。
 *
 * （4）观察者模式满足开闭原则的要求，增加新的具体观察者无须修改原有的系统代码。
 *
 * 2.主要缺点     *
 * （1）如果一个观察目标对象有很多的直接观察者和间接观察者，那么所有的观察者接收到消息会耗费大量的时间。
 *
 * （2）如果观察者和被观察者之间存在循环依赖，那么观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
 *
 * （3）观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道目标观察对象发生了变化。
 **/
