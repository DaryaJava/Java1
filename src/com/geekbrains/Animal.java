package com.geekbrains;

public class Animal {
    protected double runMax;
    protected double jumpMax;
    protected double swimMax;
    protected String mame;

    public Animal(double runMax, double jumpMax, double swimMax, String name) {
        this.runMax = runMax;
        this.jumpMax = jumpMax;
        this.swimMax = swimMax;
        this.mame = name;
    }

    public void run(double value) {
        System.out.println(mame + " runs " + value + " > " + (value < runMax));
    }

    public void jump(double value) {
        System.out.println(mame + " jumps " + value + " > " + (value < runMax));
    }

    public void swim(double value) {
        System.out.println(mame + " swims " + value + " > " + (value < runMax));
    }
}
