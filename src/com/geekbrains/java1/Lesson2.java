package com.geekbrains.java1;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }

        printArray(array);
    }

    private static void task2() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }

        printArray(array);
    }

    private static void task3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        printArray(array);
    }

    private static void task4() {
        int size = 5;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    array[i][j] = 1;
                }
            }
        }

        printArray(array);
    }


    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            printArray(ints);
        }
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

}
