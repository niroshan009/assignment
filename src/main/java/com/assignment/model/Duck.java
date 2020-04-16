package com.assignment.model;

import com.assignment.SingBehaviour;
import com.assignment.behaviour.Swim;

public class Duck extends Bird implements Animal, Swim {

    @Override
    public void sing() {
        System.out.println("Quack,quack");
    }
}
