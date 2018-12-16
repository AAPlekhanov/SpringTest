package com.plekhanov.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
      //  ApplicationContext context = new AnnotationConfigApplicationContext(com.plekhanov.aop.MyConf.class);

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aspConfig.xml");

        MyRepo repo = context.getBean(MyRepo.class);

       NewInterface newInterface =   (NewInterface)repo;

       newInterface.doSomeWork();

    //    repo.withParam("Max");

        System.out.println();
        System.out.println();

       // repo.getInfo();
    }
}
