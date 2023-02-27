package com.study.design.strategy;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author zhutongtong
 * @date 2022/9/2 15:18
 */
public final class OptionalUtil<T> {

	private final T value;


	private OptionalUtil() {
		this.value = null;
	}

	private OptionalUtil(T value) {
		this.value = Objects.requireNonNull(value);
	}


	private static final OptionalUtil<?> EMPTY = new OptionalUtil<>();


	public static<T> OptionalUtil<T> empty() {
		@SuppressWarnings("unchecked")
		OptionalUtil<T> t = (OptionalUtil<T>) EMPTY;
		return t;
	}

	public static <T> OptionalUtil<T> ofNullable(T value) {
		return value == null ? empty() : of(value);
	}

	public static <T> OptionalUtil<T> of(T value) {
		return new OptionalUtil<>(value);
	}

	public void ifPresent(Consumer<? super T> consumer) {
		if (value != null)
			consumer.accept(value);
	}

}

class Test1{
	void test(){
		Optional.ofNullable(null);
		Integer a = null;
		OptionalUtil.ofNullable(a).ifPresent(k-> {

		});
	}
}


