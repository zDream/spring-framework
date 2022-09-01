package com.study.design.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Farmer implements ISubscriber{
	private static final Logger logger = LoggerFactory.getLogger(Farmer.class);

	public void todoTomorrow(String msg) {

		if("rain".equals(msg)){
			logger.info("FARMER : a wonderful day!!!");
		}else if("sunny".equals(msg)){
			logger.info("FARMER : a enrich day!!!");
		}else {
			logger.info("FARMER : Spam messages");
		}
	}
}




