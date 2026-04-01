package com.mphasis.firstspringapp.service;

public class Car {
    private String model;
    private Engine engine;
    private int year;

    public Car(String model, Engine engine, int year) {
        this.model = model;
        this.engine = engine;
        this.year = year;
    }

    public void display() {
        System.out.println(model + " | " + year +
                " | Engine: " + engine.getType() +
                " (" + engine.getHorsepower() + "hp)");
    }
}