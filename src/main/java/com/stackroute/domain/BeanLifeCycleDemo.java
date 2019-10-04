package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean
    {

        @Override
        public void destroy() throws Exception
            {
                System.out.println("\n Destroying the bean \n");
            }

        @Override
        public void afterPropertiesSet() throws Exception
            {
                System.out.println("\n Properties are set \n");
            }
        @PostConstruct
        public void customInit()
            {
                System.out.println("\n Before initializing object \n");
            }
        @PreDestroy
        public void customDestroy()
            {
                System.out.println("\n After Destruction of bean \n");
            }
    }
