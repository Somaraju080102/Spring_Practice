package com.nani;

import org.springframework.stereotype.Component;

@Component
public class Sleeping implements Thinking {

    public Sleeping(){
        System.out.println("Sleeping object is created");
    }
    public void sleeper(){
        System.out.println("Stop Thinking and Sleep");
    }
}
