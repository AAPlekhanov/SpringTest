package com.plekhanov.implementation;

import com.plekhanov.interfaces.Car;
import com.plekhanov.interfaces.Radio;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Date;

@Component()
public class Toyota implements Car , ApplicationContextAware {
   // @Autowired
    Radio radio;

    public Toyota(Radio radio,  String owner){
        this.radio = radio;
        this.owner = owner;
    }

    ApplicationContext context;


  private   String owner;


    public void drive() {
        radio.listenRadio();
        System.out.println("drive by " + owner);
        System.out.println(new Date(context.getStartupDate()));
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context=applicationContext;
    }
}
