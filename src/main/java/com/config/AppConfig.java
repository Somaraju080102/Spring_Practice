package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nani.Sleeping;

/**
 * AppConfig
 */

@Configuration
public class AppConfig {

    @Bean
    public Sleeping sleeping (){
        return new Sleeping();
    }
}