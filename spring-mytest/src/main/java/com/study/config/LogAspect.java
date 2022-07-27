package com.study.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zhutongtong
 * @date 2022/7/27 10:08
 */
@Aspect
@Component
public class LogAspect {

	@Pointcut("execution(* com.study.service..*(..))")
	public void pointCut(){

	}


//	@Before("pointCut()")
//	public void beforeAdvice(JoinPoint joinPoint){
//		System.out.println("beforeAdvice");
//	}
//
//	@After("pointCut()")
//	public void afterAdvice(JoinPoint joinPoint){
//		System.out.println("afterAdvice");
//	}

	@Around("pointCut()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("around before");

		joinPoint.proceed();
		System.out.println("around after");
	}


}
