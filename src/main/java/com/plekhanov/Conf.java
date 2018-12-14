package com.plekhanov;


import com.plekhanov.implementation.BestFm;
import com.plekhanov.implementation.Toyota;
import com.plekhanov.implementation.WorstRadio;
import com.plekhanov.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;


@Configuration
@PropertySource("classpath:springProperties")
public class Conf {
    @Autowired
    Environment environment;

    @Bean
    public Toyota getToyota(){
        return new Toyota(getRadio(), environment.getProperty("name"));
    }

    @Bean
    @Profile("default")
    public Radio getRadio(){
        return new BestFm();
    }

    @Bean
    @Profile("dev")
    public Radio getWorstRadio() {
        return new WorstRadio();
    }
}
