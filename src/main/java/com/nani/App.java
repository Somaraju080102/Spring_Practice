package com.nani;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Sleeping sl=context.getBean(Sleeping.class);
        
        sl.sleeper();

        // ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
        // Code code=(Code)context.getBean("c1");
        // code.exec();
        // Studying desk=(Studying)context.getBean("sleep2");
    }
}
