package com.plekhanov.implementation;

import com.plekhanov.interfaces.Radio;
import org.springframework.stereotype.Component;

//@Component
public class BestFm implements Radio {
    public void listenRadio() {
        System.out.println("cool music");
    }
}
