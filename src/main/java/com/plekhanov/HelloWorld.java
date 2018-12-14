package com.plekhanov;

import com.plekhanov.implementation.DavinchiCode;
import com.plekhanov.implementation.Toyota;
import com.plekhanov.interfaces.Book;
import com.plekhanov.interfaces.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

public class HelloWorld {

    public static void main(String[] args) {

       ApplicationContext applicationContext = new  AnnotationConfigApplicationContext(Conf.class);
 //      AnnotationConfigApplicationContext applicationContext = new  AnnotationConfigApplicationContext();


//        applicationContext.getEnvironment().setActiveProfiles("dev");
//
//
//              applicationContext.register(Conf.class);
//              applicationContext.refresh();

//        Book davinchiCode =  applicationContext.getBean(DavinchiCode.class);
   //     davinchiCode.read();

    //    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:SpringConfiguration.xml");

         Car toyota =  applicationContext.getBean(Toyota.class);


         ((AnnotationConfigApplicationContext) applicationContext).close();

         toyota.drive();
    }
}
