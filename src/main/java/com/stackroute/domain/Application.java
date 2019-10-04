package com.stackroute.domain;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        System.out.println("\n"+"using Application context"+"\n");
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ConfigClass.class);
        System.out.println("\n Demo of auto wire 'By Name' \n");
        Movie movie= (Movie) applicationContext.getBean("movie1");
        System.out.println("\n"+movie.getActor().toString()+"\n");
       /* "this part throws an ecxeption becaue two beans of same type is there "*/
//        Movie movie1= (Movie) applicationContext.getBean("movie");
//        System.out.println("\n Demo of get type ecxeption \n");
//        System.out.println("\n"+movie1.getActor().toString()+"\n");
        System.out.println("\n Demo of constructor auto wiring \n");
        Movie movie2= (Movie) applicationContext.getBean("movie5");
        System.out.println("\n"+movie2.getActor().toString()+"\n");
    }

}
