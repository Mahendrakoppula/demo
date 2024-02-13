package com.first.firstproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Applicationconfig {

    	@Bean("myBean")
    public Myclass myclass(){
        return new Myclass();
    }
}
