package com.demo.dependson.bean;

public class EventPublisherBean {
	public void initialize() {
        System.out.println("EventPublisherBean initializing");
        EventManager.getInstance().publish("event published from EventPublisherBean");
    }

}
