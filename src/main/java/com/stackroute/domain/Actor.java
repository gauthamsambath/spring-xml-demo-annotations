package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor
    {
        private String name;
        private String gender;
        private int age;

        public String getName() {
            return name;
        }
        @Value("${actor_name}")
        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }
        @Value("${actor_gender}")
        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }
        @Value("${actor_age}")
        public void setAge(int age) {
            this.age = age;
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
