package com.demo.resouce.client;

import java.util.Arrays;

import javax.annotation.Resource;

import com.demo.resource.intrface.OrderService;

public class OrderServiceClient {
	@Resource(name="orderServiceIml1")
	private OrderService orderService;

	public void showPendingOrderDetails() {
		for(String orderId:Arrays.asList("100","200","300")) {
			System.out.println(orderService.getOrderDetails(orderId));
		}
		
	}

}
