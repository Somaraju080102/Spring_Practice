package com.nani;

import org.springframework.stereotype.Component;

@Component

public class Studying implements Thinking {

    public Studying(){
        System.out.println("Student object is created");
    }

    @Override
    public  void sleeper(){
        System.out.println("Stop Thinking and Stydy ");
    }
    
}
