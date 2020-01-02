package com.demo.resource.impl;

import com.demo.resource.intrface.OrderService;

public class OrderServiceImpl1 implements OrderService{

	@Override
	public String getOrderDetails(String orderId) {
		
		return "Order details from impl1 for orderId:- "+orderId;
	}

}
