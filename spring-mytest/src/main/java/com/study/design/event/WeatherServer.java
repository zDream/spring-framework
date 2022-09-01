package com.study.design.event;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/*发布者具体实现类*/
public class WeatherServer implements IWeather {

	private static final Logger logger = LoggerFactory.getLogger(WeatherServer.class);

	/*用来保存注册了的所有订阅者*/
	private List<ISubscriber> subscribers = new ArrayList<ISubscriber>();

	public void addSubscriber(ISubscriber subscriber) {
		subscribers.add(subscriber);
		logger.info("a new subscriber is joining");
	}

	public void delSubscriber(ISubscriber subscriber) {
		subscribers.remove(subscriber);
		logger.info("a subscriber is leaving");
	}

	public void publishInfo(String msg) {
		for(ISubscriber subscriber : subscribers) subscriber.todoTomorrow(msg);
		logger.info(String.format("publish a msg: %s ",msg));
	}
}
