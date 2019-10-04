package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie
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
    }
