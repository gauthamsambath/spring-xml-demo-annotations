package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;

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
        @Autowired
        @Value("disha")
        public void setName(String name) {
            this.name = name;
        }

        public Actor() {
        }

        @Autowired
        @Value("female")
        public void setGender(String gender) {
            this.gender = gender;
        }
        @Autowired
        @Value("16")
        public void setAge(int age) {
            this.age = age;
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
