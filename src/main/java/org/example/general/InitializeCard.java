package org.example.general;

import java.util.Random;

import static org.example.general.LocationShips.checkCoordinates;
import static org.example.general.LocationShips.checkLocationShips;
import static org.example.general.ManualGetParameters.getManualParameters;

public class InitializeCard extends PlaceShips {

    private final Random rand = new Random();

    public void initializeCard(String option) {
        String[][] card = new String[10][10];

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                card[i][k] = " * ";
            }
        }

        for (int i = 4; i != 0; i--) {
            for (int j = i; j != 5; j++) {
                if (option.equals("1")) {
                    runRandomPlaceShips(card, i);
                } else {
                    runManualPlaceShips(card, i);
                }
            }
        }
        printCard(card);
    }

    private void runManualPlaceShips(String[][] card, int length) {
        Parameters p;
        do {
            p = getManualParameters(length);
        } while (!checkCoordinates(p.getX(), p.getY(), p.isHorizontal(), length) ||
                !checkLocationShips(p.getX(), p.getY(), card, p.isHorizontal(), length));
        placeShip(card, p.getLength(), p.getX(), p.getY(), p.isHorizontal());
    }

    private void runRandomPlaceShips(String[][] card, int length) {
        int x;
        int y;
        boolean horizontal;
        do {
            x = rand.nextInt(10);
            y = rand.nextInt(10);
            horizontal = rand.nextBoolean();
        } while (!checkCoordinates(x, y, horizontal, length) || !checkLocationShips(x, y, card, horizontal, length));
        placeShip(card, length, x, y, horizontal);
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
