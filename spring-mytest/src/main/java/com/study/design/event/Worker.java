package com.study.design.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhutongtong
 * @date 2022/8/31 11:49
 */
public class Worker implements ISubscriber{
	private static final Logger logger = LoggerFactory.getLogger(Farmer.class);

	public void todoTomorrow(String msg) {

		if("rain".equals(msg)){
			logger.info("WORKER : a satisfied day!!!");
		}else if("sunny".equals(msg)){
			logger.info("WORKER : a terrible day!!!");
		}else {
			logger.info("WORKER : Spam messages");
		}
	}
}