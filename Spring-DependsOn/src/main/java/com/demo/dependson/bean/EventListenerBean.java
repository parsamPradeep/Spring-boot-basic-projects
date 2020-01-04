package com.demo.dependson.bean;

public class EventListenerBean {
	private void initialize() {
		EventManager.getInstance().addListener(s-> System.out.println("event recived in eventListener: "+s));

}
}
