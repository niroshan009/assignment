package com.assignment.model;

import com.assignment.behaviour.Sing;
import com.assignment.behaviour.Walk;

public class Chiken implements Animal, Sing, Walk {
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}
