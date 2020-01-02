package com.demo.injectbyname;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.injectbyname.client.OrderServiceClient;
import com.demo.injectbyname.service.OrderService;
import com.demo.injectbyname.service.impl.OrderServiceImpl1;
import com.demo.injectbyname.service.impl.OrderServiceImpl2;

@Configuration
public class AppRunner2 {
	@Bean(name="OrderServiceA")
	public OrderService orderServiceProvider1() {
		return new OrderServiceImpl1();
	}
	@Bean(name="OrderServiceB")
	public OrderService orderServiceProvider2() {
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
