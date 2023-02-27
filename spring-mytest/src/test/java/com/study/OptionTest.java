package com.study;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author zhutongtong
 * @date 2022/9/2 11:29
 */
public class OptionTest {

	@Test
	void test1(){

		OptionTest java8Tester = new OptionTest();
		Integer value1 = null;
		Integer value2 = new Integer(10);

		// Optional.ofNullable - 允许传递为 null 参数
		Optional<Integer> a = Optional.ofNullable(value1);

		// Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
		Optional<Integer> b = Optional.of(value2);
		System.out.println(java8Tester.sum(a,b));
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b){

		// Optional.isPresent - 判断值是否存在

		System.out.println("第一个参数值存在: " + a.isPresent());
		System.out.println("第二个参数值存在: " + b.isPresent());

		// Optional.orElse - 如果值存在，返回它，否则返回默认值
		Integer value1 = a.orElse(new Integer(0));

		//Optional.get - 获取值，值需要存在
		Integer value2 = b.get();
		return value1 + value2;
	}

	@Test
	void test2(){
		Integer value1 = null;
		Optional.ofNullable(value1).ifPresent(System.out::println);

		Integer integer = Optional.ofNullable(value1).orElse(3);

		Integer integer1 = Optional.ofNullable(value1).orElse(55);

		List<String> list = null;
//		list.add("333");
		Optional.ofNullable(list).ifPresent(k->k.forEach(j->{
			System.out.println(j);
		}));

//		Optional.ofNullable(value1).map(k->k == 0).

	}


	@Test
	void test3(){
		BigDecimal bigDecimal = null;
		//下边这个三目 运算符如何用 Option 或者stream一行写出来，
		String result = null != bigDecimal && BigDecimal.ZERO.compareTo(bigDecimal) == 0 ? addMethod(bigDecimal) : "" ;

//		Object ob = null;
//		Optional.ofNullable(objectTest(ob)).orElseThrow(()->new RuntimeException());

//		Optional.ofNullable(bigDecimal).flatMap(k -> BigDecimal.ZERO.compareTo(bigDecimal) == 0)
		Optional.ofNullable(bigDecimal).map(k -> BigDecimal.ZERO.compareTo(bigDecimal) == 0).filter(k->k);


//		Optional.ofNullable(bigDecimal).ifPresent();
	}

	String addMethod(BigDecimal bigDecimal){
		return bigDecimal.add(BigDecimal.TEN).toString();
	}

	Object objectTest(Object ob){
		return null;
	}
}
