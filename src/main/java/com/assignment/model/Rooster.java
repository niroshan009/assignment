package com.assignment.model;

import com.assignment.behaviour.Sing;
import com.assignment.behaviour.Walk;

public class Rooster implements Animal, Sing, Walk {
    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}
