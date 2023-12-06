package com.company;

public class Wish {
    private String name;
    private double price;
    private int priority;


    public Wish(String name, double price, int priority) {
        this.name = name;
        this.price = price;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPriory() {
        return priority;
    }

    public void setPriory(int priory) {
        this.priority = priory;
    }
}
