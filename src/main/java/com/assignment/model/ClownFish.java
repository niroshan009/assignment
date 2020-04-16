package com.assignment.model;

public class ClownFish extends  Fish{
    private String color;
    private String size;

    public ClownFish(String color) {
        this.size = "small";
        this.color = color;
    }
    public void makeJoke(){
        System.out.println("I am making a joke");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
