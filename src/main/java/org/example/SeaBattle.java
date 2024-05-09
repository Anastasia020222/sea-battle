package org.example;

import java.util.Random;

public class SeaBattle {

    //Нарисовать в консоли карту морского боя с раставленными караблями. Каждый раз, при запуске программы расположение
    //кораблей должно меняться
    //Всего кораблей: 1 - 4 палубы; 2 - 3 палубы; 3 - 2 палубы; 4 - 1 палуба

    public static void main(String[] args) {
        initializeCard();
    }

    //отрисовка карты
    private static void initializeCard() {
        String[][] card = new String[10][10];

        for (int i = 0; i <= 9; i++) {
            for (int k = 0; k <= 9; k++) {
                card[i][k] = " * ";
            }
        }
        placeShip(card, 4);
        placeShip(card, 3);
        placeShip(card, 3);
        printCard(card);

    }

    private static void placeShip(String[][] card, int length) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        boolean horizontal = rand.nextBoolean();

        if (!checkLocationShips(x, y, card, horizontal, length)) {
            x = rand.nextInt(10);
            y = rand.nextInt(10);
            horizontal = rand.nextBoolean();
        }

        if (horizontal) {
            for (int i = 0; i < length; i++) {
                card[x][y + i] = " X ";
            }
        } else {
            for (int i = 0; i < length; i++) {
                card[x + i][y] = " X ";
            }
        }
    }

    private static boolean checkLocationShips(int x, int y, String[][] card, boolean horizontal, int length) {
        if (horizontal) {
            if (y + length > 10) {
                return false;
            } else {
                return true;
            }
        } else {
            if (x + length > 10) {
                return false;
            } else {
                return true;
            }
        }
    }

    private static void printCard(String[][] card) {
        System.out.println(" 1  2  3  4  5  6  7  8  9  10");
        System.out.println("------------------------------");

        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (String[] row : card) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}