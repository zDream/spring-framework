package com.study.design.event;

/*订阅者接口,所有订阅WeatherServer 的订阅者都要实现该接口,定义了收到发布者消息之后做出反应的方法*/

public interface ISubscriber {
	void todoTomorrow(String msg);
}
