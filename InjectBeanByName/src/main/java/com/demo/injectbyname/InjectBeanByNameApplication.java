package com.demo.injectbyname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.injectbyname.client.OrderServiceClient;

@SpringBootApplication
public class InjectBeanByNameApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectBeanByNameApplication.class, args);
		
	}

}
