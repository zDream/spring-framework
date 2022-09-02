package com.study.design.chain;

/**
 * @author zhutongtong
 * @date 2022/9/1 10:28
 */
abstract class InterceptChain<T> {
	InterceptChain<T> next;

	void intercept(T data) {
		if(null == next){
			return;
		}
		next.intercept(data);
	}
}