package com.plekhanov.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class IntroduceAspect {

    // к интерфейсу com.plekhanov.aop.MyRepo добавляем имплементацию NewInterfaceImp.class

   // @DeclareParents(value = "com.plekhanov.aop.MyRepo+" , defaultImpl = NewInterfaceImp.class)
    public  static NewInterface newInterface;            // интерфейс
}
