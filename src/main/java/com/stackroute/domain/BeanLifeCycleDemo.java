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
                System.out.println("Destroying the bean");
            }

        @Override
        public void afterPropertiesSet() throws Exception
            {
                System.out.println("Properties are set");
            }
        @PostConstruct
        public void customInit()
            {
                System.out.println("Before initializing object");
            }
        @PreDestroy
        public void customDestroy()
            {
                System.out.println("After Destruction of bean");
            }
    }
