package com.assignment;

import com.assignment.model.Bird;

public class Solution {
    public static void main(String[] args){
        SingBehaviour singBehaviour = ()->{
            System.out.println("I am singing");
        };
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing(singBehaviour);

    }
}
