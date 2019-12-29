package com.demo.injectbyname.service.impl;

import com.demo.injectbyname.service.OrderService;

public class OrderServiceImpl1 implements OrderService{

	@Override
	public String getOrderDetails(String orderID) {
		
		return "Order details from OrderDetalsImpl1, for OrderId="+orderID;
	}
	

}
