package com.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        while (true) {
            startNewGame();
            if (!askUser()) {
                return;
            }
        }
    }

    private static void startNewGame() {
        System.out.println("Введите число от 0 до 9");
        int number = new Random().nextInt(10);
        int attempt = 0;
        while (attempt < 3) {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i == number) {
                System.out.println("Победа");
            }
            attempt++;
        }
        System.out.println("Поражение");
    }

    private static boolean askUser() {
        while (true) {
            System.out.println("Повторить игру еще раз?");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == 1) {
                return true;
            }
            if (answer == 0) {
                return false;
            }
        }
    }
}
