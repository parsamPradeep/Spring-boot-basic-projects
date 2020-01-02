package com.demo.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.demo.lifecycle.bean.MyBean;
import com.demo.lifecycle.otherbean.OtherBean;

public class LifeCycleExample1 {
	@Bean(initMethod="myPostConstructor" , destroyMethod="cleanUp")
	public MyBean myBean() {
		return new MyBean();
	}
	@Bean
	public OtherBean otherBean() {
		return new OtherBean();
	}
	public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(LifeCycleExample.class);

        context.registerShutdownHook();

        System.out.println("-- accessing bean --");
        MyBean bean = context.getBean(MyBean.class);
        bean.doSomething();

        System.out.println("-- finished --");
    }
}
