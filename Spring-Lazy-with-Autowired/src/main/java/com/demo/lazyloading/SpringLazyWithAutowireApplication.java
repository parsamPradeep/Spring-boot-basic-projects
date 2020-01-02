package com.demo.lazyloading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import com.demo.lazyloading.bean.Eagerbean;
import com.demo.lazyloading.bean.LazyBean;

@SpringBootApplication
public class SpringLazyWithAutowireApplication {

	 public static void main (String[] args) {
	        ApplicationContext context =
	                  new AnnotationConfigApplicationContext(
	                            MyConfig.class);
	        System.out.println("--- container initialized ---");
	        Eagerbean bean = context.getBean(Eagerbean.class);
	        System.out.println("MyEagerBean retrieved from bean factory");
	        bean.doSomethingWithLazyBean();
	    }

	    public static class MyConfig {

	        @Bean
	        public Eagerbean eagerBean () {
	            return new Eagerbean();
	        }

	        @Bean
	        @Lazy
	        public LazyBean lazyBean () {
	            return new LazyBean();
	        }
	    }

}
