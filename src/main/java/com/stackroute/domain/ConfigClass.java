package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:values-config.properties")

public class ConfigClass
    {
        String name;
        String gender;
        int age;
        @Bean
        public Actor actorObject()
            {
                return new Actor(name,gender,age);
            }

        @Bean(name = {"movie1","movie2"})
        public Movie movieObject()
            {
                return new Movie(actorObject());
            }
        @Bean(name = {"movie3","movie4"})
        @Lazy
        public Movie movieObject1()
        {
            return new Movie(actorObject());
        }
        @Lazy
        @Bean(name = {"movie5","movie6"})
        public Movie movieObject2()
        {
            return new Movie();
        }


    }
