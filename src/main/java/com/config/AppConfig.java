package com.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.nani.Sleeping;
import com.nani.Studying;
import com.nani.Thinking;
import com.nani.Code;

/**
 * AppConfig
 */

@Configuration
public class AppConfig {

    @Bean
    public Code exe(@Qualifier("sleeping") Thinking Sleep){
        Code obj=new Code();
        return obj;
    }

    @Bean
    public Sleeping sleeping (){
        return new Sleeping();
    }
    @Bean
    @Primary
    public Studying studying (){
        return new Studying();
    }
}