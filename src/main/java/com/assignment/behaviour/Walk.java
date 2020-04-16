package com.assignment.behaviour;

public interface Walk {
    default void walk(){
        System.out.println("I am walking");
    }
}
