package com.demo.lazyloading.bean;

import javax.annotation.PostConstruct;

public class LazyLoadinBean {
@PostConstruct
public void intialization() {
	System.out.println("lazy loading bean");
}
public void dosomthing() {
	System.out.println("lazyloading Bean methode");
}
}
