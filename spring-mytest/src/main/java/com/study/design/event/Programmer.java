package com.study.design.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhutongtong
 * @date 2022/8/31 11:50
 */
public class Programmer implements ISubscriber{
	private static final Logger logger = LoggerFactory.getLogger(Farmer.class);

	public void todoTomorrow(String msg) {

		if("rain".equals(msg)){
			logger.info("PROGRAMMER :raining??? Irrelevant !!!");
		}else if("sunny".equals(msg)){
			logger.info("PROGRAMMER : sunny Irrelevant !!!");
		}else {
			logger.info("PROGRAMMER : Spam messages");
		}
	}
}
