package dev.micfro.d4mvcforms.model;

public class User {

    private String fruit;
    private String color;

    public User() {
    }

    public User(String fruit, String color) {
        this.fruit = fruit;
        this.color = color;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "User: " + fruit + " " + color;
    }



}
