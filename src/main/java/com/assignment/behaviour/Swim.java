package com.assignment.behaviour;

public interface Swim {
    default void swim(){
        System.out.println("I am swimming");
    }
}
