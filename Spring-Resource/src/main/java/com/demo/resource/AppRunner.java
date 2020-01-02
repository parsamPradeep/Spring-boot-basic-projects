package com.demo.resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.resouce.client.OrderServiceClient;
import com.demo.resource.impl.OrderServiceImpl1;
import com.demo.resource.impl.OrderServiceImpl2;
import com.demo.resource.intrface.OrderService;

@Configuration
public class AppRunner {
	@Bean(name="orderServiceIml1")
	public OrderService orderServiceImp1Provider() {
		return new OrderServiceImpl1();
	}
	@Bean(name="orderServiceIml2")
	public OrderService orderServiceImp2Provider() {
		return new OrderServiceImpl2();
	}
	@Bean
	public OrderServiceClient createClient() {
		return new OrderServiceClient();
	}
	
	public static void main(String... strings) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);
        OrderServiceClient bean = context.getBean(OrderServiceClient.class);
        bean.showPendingOrderDetails();
    }

}
