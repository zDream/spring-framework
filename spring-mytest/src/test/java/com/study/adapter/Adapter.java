package com.study.adapter;

/**
 * @author zhutongtong
 * @date 2022/8/1 11:55
 */
public class Adapter extends Source implements Targetable{

	private Source source;
	public Adapter(Source source){ this.source = source; }
	public void sayHello(){ source.sayHello(); }
	@Override
	public void hi() {
		System.out.println("csc:hi!");
	}

	public static void main(String[] args) {
		Adapter adapter = new Adapter(new Source());
		adapter.sayHello();
		adapter.hi();
	}
}
