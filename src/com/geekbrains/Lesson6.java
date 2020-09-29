package com.geekbrains;

public class Lesson6 {

    public static void main (String[] args) {
        Animal dog = new Dog(500, 0.5, 10);
        Animal cat = new Cat(200, 2);

        dog.run(100);
        dog.jump(10);
        dog.swim(10);

        cat.run(100);
        cat.jump(10);
        cat.swim(10);
    }
}
