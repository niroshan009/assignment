package com.assignment.model;

public class Shark extends Fish {
    private String color;
    private String size;

    public Shark() {
        this.color = "Grey";
        this.size = "Large";
    }

    public void eatOtherFixh() {
        System.out.println("I am eating other fish");
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
