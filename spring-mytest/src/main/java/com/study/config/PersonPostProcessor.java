package com.study.config;

import com.study.entity.Person;
import groovy.util.logging.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author zhutongtong
 * @date 2022/7/26 15:09
 */
@Component
public class PersonPostProcessor implements BeanFactoryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("******************** TestBeanFactoryPostProcessor#postProcessBeanFactory ****************");
	}
}
