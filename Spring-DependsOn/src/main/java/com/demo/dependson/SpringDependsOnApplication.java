package com.demo.dependson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import com.demo.dependson.bean.EventListenerBean;
import com.demo.dependson.bean.EventPublisherBean;

@SpringBootApplication
@ComponentScan("com.demo.dependson.bean")
public class SpringDependsOnApplication {

	 @Bean(initMethod = "initialize")
	    @DependsOn("eventListener")
	    public EventPublisherBean eventPublisherBean () {
	        return new EventPublisherBean();
	    }

	    @Bean(name = "eventListener", initMethod = "initialize")
	     @Lazy
	    public EventListenerBean eventListenerBean () {
	        return new EventListenerBean();
	    }

	    public static void main (String... strings) {
	        new AnnotationConfigApplicationContext(SpringDependsOnApplication.class);
	    }

}
