package com.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class XOGame {
    public static char[][] map;
    public static final int SIZE = 3;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    private static boolean checkWin(char symb) {
        return checkCrossLines(symb) || checkHorizontalLines(symb) || checkVerticalLines(symb);
    }

    private static boolean checkHorizontalLines(char symb) {
        for (int i = 0; i < SIZE; i++) {
            if (checkHorizontalLine(i, symb)) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkVerticalLines(char symb) {
        for (int i = 0; i < SIZE; i++) {
            if (checkVerticalLine(i, symb)) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkHorizontalLine(int y, char symb) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][y] != symb) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkVerticalLine(int x, char symb) {
        for (int i = 0; i < SIZE; i++) {
            if (map[x][i] != symb) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCrossLines(char symb) {
        return checkCrossLineRight(symb) || checkCrossLineLeft(symb);
    }

    private static boolean checkCrossLineRight(char symb) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - i - 1] != symb) {
                return false;
            }
        }

        return true;
    }

    private static boolean checkCrossLineLeft(char symb) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] != symb) {
                return false;
            }
        }

        return true;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
