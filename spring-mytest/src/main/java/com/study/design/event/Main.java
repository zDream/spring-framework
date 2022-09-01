package com.study.design.event;

/**
 * @author zhutongtong
 * @date 2022/8/31 11:51
 */
public class Main {

	public static void main(String[] args){
		Farmer farmer = new Farmer();
		Worker worker = new Worker();
		Programmer programmer = new Programmer();

		WeatherServer weatherServer = new WeatherServer();

		weatherServer.addSubscriber(farmer);
		weatherServer.addSubscriber(worker);
		weatherServer.addSubscriber(programmer);

		weatherServer.publishInfo("rain");
	}
}
