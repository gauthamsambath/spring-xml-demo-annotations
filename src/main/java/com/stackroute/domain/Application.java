package com.stackroute.domain;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
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
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie= (Movie) applicationContext.getBean("movie");
        System.out.println("\n"+movie.getActor().toString()+"\n");
        System.out.println("\n"+"Using FileSystemXmlApplicationContext "+"\n");
        ApplicationContext applicationContext1=new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
        Movie movie1= (Movie) applicationContext1.getBean("movie");
        System.out.println("\n"+ movie1.getActor().toString()+"\n");
        System.out.println("\n"+"Using XML bean factory"+"\n");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        Movie movie2= (Movie) xmlBeanFactory.getBean("movie");
        System.out.println("\n"+movie2.getActor().toString()+"\n");
        System.out.println("\n"+"Using BeanDefinitionRegistry and BeanDefinitionReader "+"\n");
        DefaultListableBeanFactory beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movie movieBeanRegistry = beanDefinitionRegistry.getBean("movie", Movie.class);
        System.out.println("\n"+movieBeanRegistry.getActor().toString()+"\n");

    }

}
