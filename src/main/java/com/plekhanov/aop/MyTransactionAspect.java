package com.plekhanov.aop;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class MyTransactionAspect {

  //  @Before("execution(* com.plekhanov.aop.MyUserInfo.getInfo())")
    public void beginTransaction(){
        System.out.println("begin transaction");
    }
   //  @AfterThrowing("execution(* com.plekhanov.aop.MyUserInfo.getInfo())")
    public void commitTransaction(){
         System.out.println("commit transaction");
    }


  //  @After("execution(* com.plekhanov.aop.MyUserInfo.getInfo())")
    public void after(){
        System.out.println("after transaction");
    }


  //  @AfterReturning("execution(* com.plekhanov.aop.MyUserInfo.getInfo())")
    public void rollback(){
        System.out.println("rollback transaction");
    }
}
