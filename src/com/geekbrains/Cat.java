package com.geekbrains;

public class Cat extends Animal {
    public Cat(double runMax, double jumpMax) {
        super(runMax, jumpMax, 0, "cat");
    }

    @Override
    public void swim(double distance) {
        System.out.println("cats can't swim");
    }
}
