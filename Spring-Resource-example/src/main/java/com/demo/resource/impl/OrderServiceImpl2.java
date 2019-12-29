package com.demo.resource.impl;

import com.demo.resource.intrface.OrderService;

public class OrderServiceImpl2 implements OrderService{

	@Override
	public String getOrderDetails(String orderId) {
		return "Order details from impl2 for orderId:- "+orderId;
	}

}
