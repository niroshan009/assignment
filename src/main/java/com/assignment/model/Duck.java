package com.assignment.model;

import com.assignment.SingBehaviour;

public class Duck extends Bird implements Animal {

    @Override
    public void sing() {
        System.out.println("Quack,quack");
    }
}
