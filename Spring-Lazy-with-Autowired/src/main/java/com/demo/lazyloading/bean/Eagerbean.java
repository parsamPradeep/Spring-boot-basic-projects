package com.demo.lazyloading.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class Eagerbean {

    @Autowired
    @Lazy
    private LazyBean myLazyBean;

    @PostConstruct
    public void init () {
        System.out.println(getClass().getSimpleName() + " has been initialized");
    }

    public void doSomethingWithLazyBean () {
        System.out.println("Using lazy bean");
        myLazyBean.doSomething();
    }

}
