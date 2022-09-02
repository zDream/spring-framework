package com.study.design.chain;

import org.testng.annotations.Test;

/**
 * @author zhutongtong
 * @date 2022/9/1 10:31
 */

public class Main {

//	@Test
	public static void  main(String[] args) {
//		System.out.println("333");
		InterceptChainHandler<String> intercepts = new InterceptChainHandler<>();
		intercepts.add(new OneIntercept());
		intercepts.add(new TwoIntercept());
		intercepts.intercept("测试拦截器");
	}

}

class OneIntercept extends InterceptChain<String> {

	@Override
	void intercept(String data) {
//		data = "$data：OneIntercept";
		System.out.println("OneIntercept");
		super.intercept(data);
	}
}

class TwoIntercept extends InterceptChain<String> {
	@Override
	void intercept(String data) {
//		data = "$data：TwoIntercept";
		System.out.println("TwoIntercept");
		super.intercept(data);
	}
}

