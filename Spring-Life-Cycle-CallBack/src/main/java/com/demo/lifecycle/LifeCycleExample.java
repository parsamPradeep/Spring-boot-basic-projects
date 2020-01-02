package com.demo.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.lifecycle.bean.MyBean;
import com.demo.lifecycle.otherbean.OtherBean;

@Configuration
public class LifeCycleExample {	
	@Bean
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
        //context.close();
    }

}
