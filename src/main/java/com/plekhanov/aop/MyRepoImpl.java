package com.plekhanov.aop;


import org.springframework.stereotype.Component;

@Component
public class MyRepoImpl implements MyRepo {
    public void getInfo() {
        System.out.println("User Max age 25");
    }

    public void withParam(String name) {
        System.out.println(name);
    }
}
