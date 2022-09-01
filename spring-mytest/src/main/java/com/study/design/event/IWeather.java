package com.study.design.event;

/**
 * @author zhutongtong
 * @date 2022/8/31 11:44
 */
/*发布者接口,定义注册发布者,删除发布者,发布消息的接口*/
public interface IWeather {

	void addSubscriber(ISubscriber subscriber);

	void delSubscriber(ISubscriber subscriber);

	void publishInfo(String msg);

}