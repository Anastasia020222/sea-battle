package org.example;

import static org.example.PlaceShips.placeShip;

public class SeaBattle {

    public static void main(String[] args) {
        initializeCard();
    }

    private static void initializeCard() {
        String[][] card = new String[10][10];

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                card[i][k] = " * ";
            }
        }

        for (int i = 4; i != 0; i--) {
            for (int j = i; j != 5; j++) {
                placeShip(card, i);
            }
        }

        printCard(card);

    }

    private static void printCard(String[][] card) {
        System.out.println("     A  B  C  D  E  F  G  H  I  J ");
        System.out.println("   ------------------------------");

        String[] letters = {" 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10"};

        for (int i = 0; i < card.length; i++) {
            System.out.print(letters[i] + "| ");
            for (int j = 0; j < card[i].length; j++) {
                System.out.print(card[i][j]);
            }
            System.out.println();
        }
    }
}