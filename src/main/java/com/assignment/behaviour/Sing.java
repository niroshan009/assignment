package com.assignment.behaviour;

public interface Sing {
    default void sing(){
        System.out.println("I am singing");
    };
}
