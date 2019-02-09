package com.plekhanov.aop_xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // конфигурация Spring Aop через xml, перед вызовом printReport объекта класса Report ,
        // Вызываем метод  checkSecure класса ShiroSecure

        ApplicationContext context = new ClassPathXmlApplicationContext("Aop_config.xml");

        Report report = context.getBean(Report.class);

        report.printReport();

    }

}
