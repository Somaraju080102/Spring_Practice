package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nani.Sleeping;

/**
 * AppConfig
 */

@Configuration
public class AppConfig {

    @Bean(name = "obj1")
    @Scope("prototype")
    public Sleeping sleeping (){
        return new Sleeping();
    }
}