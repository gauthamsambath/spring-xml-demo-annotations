package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:values-config.properties")
public class ConfigClass
    {
        @Bean
        public Actor actorObject()
            {
                return new Actor();
            }
         @Bean
        public Movie movieObject()
            {
                return new Movie(actorObject());
            }
//        @Bean
//        public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
//            return new PropertySourcesPlaceholderConfigurer();
//        }

    }
