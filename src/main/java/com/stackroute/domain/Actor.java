package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Actor
    {
        private String name;
        private String gender;
        private int age;


        public String getName() {
            return name;
        }


        public String getGender() {
            return gender;
        }


        public int getAge() {
            return age;
        }



        @Autowired
        public Actor(String name,String gender,int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            System.out.println("Using constructor injection");
        }


        @Override
        public String toString() {
            return "Actor{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
