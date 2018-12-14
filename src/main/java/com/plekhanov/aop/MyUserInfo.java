package com.plekhanov.aop;


import org.springframework.stereotype.Component;

@Component
public class MyUserInfo implements MyRepo {
    public void getInfo() {
        System.out.println("User Max age 25");
    }
}
