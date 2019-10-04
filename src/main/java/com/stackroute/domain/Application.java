package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

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
//        System.out.println("\n Aware Interface Values \n");
//        Movie movie= (Movie) applicationContext.getBean("movie1");
//        System.out.println("\n"+movie.getActor().toString()+"\n");
        System.out.println("\n Demo of initialize,disposable,custom init,custom destroy \n");
        ((AbstractApplicationContext)applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo= (BeanLifeCycleDemo) applicationContext.getBean("bean");
        BeanPostProcessorDemoBean beanPostProcessorDemoBean= (BeanPostProcessorDemoBean) applicationContext.getBean("beanpost");
    }

}
