package com.plekhanov.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.plekhanov.aop.MyConf.class);

        MyRepo repo = context.getBean(MyRepo.class);
        repo.getInfo();
    }
}
