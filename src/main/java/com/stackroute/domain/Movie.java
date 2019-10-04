package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
    {
        Actor actor;

        public Actor getActor() {

            return actor;
        }
        @Autowired
        public void setActor(Actor actor)
            {
                this.actor = actor;
                System.out.println("passing through Movie setter");
            }
        @Autowired
        public Movie() {
            System.out.println("Passing through default constructor");
        }
        public Movie(Actor actor) {
            this.actor = actor;
            System.out.println("Passing through Movie Constructor");
        }

        @Override
        public void setBeanFactory(BeanFactory beanFactory) throws BeansException
        {
            System.out.println("Bean factory is:-"+beanFactory.toString());
        }

        @Override
        public void setBeanName(String s)
        {
            System.out.println("Bean name is:-"+ Arrays.asList(s).toString());
        }

        @Override
        public void setApplicationContext(ApplicationContext Context) throws BeansException
        {
            System.out.println("Bean context is:-"+Context.toString());
        }
    }
