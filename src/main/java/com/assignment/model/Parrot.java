package com.assignment.model;

import com.assignment.behaviour.SingBehaviour;

public class Parrot extends Bird {

    SingBehaviour singBehaviour;

    public Parrot(SingBehaviour singBehaviour) {
        this.singBehaviour = singBehaviour;
    }

    @Override
    public void sing() {
        this.singBehaviour.sing();
    }
}
