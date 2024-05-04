package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nani.Sleeping;
import com.nani.Thinking;
import com.nani.Code;

/**
 * AppConfig
 */

@Configuration
public class AppConfig {

    @Bean
    public Code exe(Thinking Sleep){
        Code obj=new Code();
        return obj;

    }

    @Bean(name = "obj1")
    public Sleeping sleeping (){
        return new Sleeping();
    }
}