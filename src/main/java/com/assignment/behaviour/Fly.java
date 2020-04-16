package com.assignment.behaviour;

public interface Fly {
    default void fly(){
        System.out.println("I'm flying");
    }
}
