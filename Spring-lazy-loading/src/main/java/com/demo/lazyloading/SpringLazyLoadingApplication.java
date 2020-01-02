package com.demo.lazyloading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import com.demo.lazyloading.bean.AlwaysUsingBean;
import com.demo.lazyloading.bean.LazyLoadinBean;

@SpringBootApplication
public class SpringLazyLoadingApplication {

	@Bean
	public AlwaysUsingBean alwaysUsingBean() {
		return new AlwaysUsingBean();
	}
	
	@Bean
	@Lazy
	public LazyLoadinBean lazyLoadingBean() {
		return new LazyLoadinBean();
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringLazyLoadingApplication.class, args);
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(SpringLazyLoadingApplication.class);
	        System.out.println("Spring container started and is ready");
	        LazyLoadinBean bean = context.getBean(LazyLoadinBean.class);
	        bean.dosomthing();
	}

}
