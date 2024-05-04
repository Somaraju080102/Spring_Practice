package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nani.Sleeping;

/**
 * AppConfig
 */

@Configuration
public class AppConfig {

    @Bean(name = "obj1")
    public Sleeping sleeping (){
        return new Sleeping();
    }
}