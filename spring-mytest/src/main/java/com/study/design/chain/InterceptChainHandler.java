package com.study.design.chain;

/**
 * @author zhutongtong
 * @date 2022/9/1 10:30
 */
class InterceptChainHandler<T> {
	InterceptChain<T> _interceptFirst;

	void add(InterceptChain<T> interceptChain) {
		if (_interceptFirst == null) {
			_interceptFirst = interceptChain;
			return;
		}

		InterceptChain<T> node = _interceptFirst;
		while (true) {
			if (node.next == null) {
				node.next = interceptChain;
				break;
			}
			node = node.next;
		}
	}

	void intercept(T data) {
		_interceptFirst.intercept(data);
	}
}