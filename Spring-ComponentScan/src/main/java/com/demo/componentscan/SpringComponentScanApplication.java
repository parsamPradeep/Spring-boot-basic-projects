package com.demo.componentscan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.demo.componentscan.bean.MyPrototypeBean;

@SpringBootApplication
@ComponentScan("com.demo.componentscan.bean")
public class SpringComponentScanApplication {

	public static void main(String... strings) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringComponentScanApplication.class);
        System.out.println("Spring container started and is ready");
        MyPrototypeBean bean = context.getBean(MyPrototypeBean.class);
        bean.doSomethign();
    }

}
