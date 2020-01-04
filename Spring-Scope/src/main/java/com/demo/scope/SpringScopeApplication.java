package com.demo.scope;

import java.util.Map;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.scope.bean.UserRegetrationBean;
import com.demo.scope.services.UserInfo;

@SpringBootApplication
public class SpringScopeApplication {

	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        UserRegetrationBean registrationBean = context.getBean(UserRegetrationBean.class);

        while (true) {
            System.out.printf("[registration bean instance: %s]\n", System.identityHashCode(registrationBean));
            System.out.println("Enter new user. Enter exit to terminate");
            registerUser(registrationBean);
            registrationBean = context.getBean(UserRegetrationBean.class);
        }
    }

    private static void registerUser(UserRegetrationBean registrationBean) {

        UserInfo userInfo = new UserInfo();
        registrationBean.setUserInfo(userInfo);

        Map<String, String> errors = null;

        while (errors == null || errors.size() > 0) {
            if (errors != null) {
                System.out.println("Errors : " + errors.values() + "\n");
                System.out.println("Please enter exit to terminate");
            }

            if (errors == null || errors.containsKey(UserRegetrationBean.KEY_EMAIL)) {
                userInfo.setEmail(getUserInput("Enter Email"));
            }
            if (errors == null || errors.containsKey(UserRegetrationBean.KEY_PASSWORD)) {
                userInfo.setPassword(getUserInput("Enter Password"));
            }

            errors = registrationBean.validate();
        }
        registrationBean.regester();
    }

    public static String getUserInput(String instruction) {
        System.out.print(instruction + ">");
        String s = scanner.nextLine();
        if ("exit".equals(s)) {
            System.exit(0);
        }
        return s;

    }

}
