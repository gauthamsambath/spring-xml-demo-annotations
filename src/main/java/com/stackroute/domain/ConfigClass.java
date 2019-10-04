package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:values-config.properties")
public class ConfigClass
    {
        String name;
        String gender;
        int age;
        @Bean
        public Actor actorObject( )
            {
                return new Actor(name,gender,age);
            }
        @Value("${actor_name}")
        public void setName(String name) {
            this.name = name;
        }
        @Value("${actor_gender}")
        public void setGender(String gender) {
            this.gender = gender;
        }
        @Value("${actor_age}")
        public void setAge(int age) {
            this.age = age;
        }

        @Bean(name = {"movie1","movie2","movieA","movieB"})
        @Scope("singleton")
        public Movie movieObject()
            {
                return new Movie(actorObject());
            }
        @Bean(name = {"movie3","movie4"})
        @Scope("prototype")
        public Movie movieObject1()
        {
            return new Movie(actorObject());
        }
//        @Bean
//        public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
//            return new PropertySourcesPlaceholderConfigurer();
//        }

    }
