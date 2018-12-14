package com.plekhanov.implementation;


import com.plekhanov.interfaces.Book;
import org.springframework.stereotype.Component;

@Component
public class DavinchiCode implements Book {
    public void read() {
        System.out.println("read book");
    }
}
