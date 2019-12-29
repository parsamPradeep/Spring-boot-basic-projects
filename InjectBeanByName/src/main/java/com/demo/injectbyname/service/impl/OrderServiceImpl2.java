package com.demo.injectbyname.service.impl;

import com.demo.injectbyname.service.OrderService;

public class OrderServiceImpl2 implements OrderService {

	@Override
	public String getOrderDetails(String orderID) {
		
		return "Order details from OrderDetalsImpl2, for OrderId="+orderID;
	}

}
