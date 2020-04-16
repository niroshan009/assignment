package com.assignment.behaviour;
src/main/java/com/assignment/behaviour/Sing.java
public interface Sing {
    default void sing(){
        System.out.println("I am singing");
    };
}
