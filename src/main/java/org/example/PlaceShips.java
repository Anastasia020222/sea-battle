package org.example;

import java.util.Random;

import static org.example.LocationShips.checkCoordinates;
import static org.example.LocationShips.checkLocationShips;

public class PlaceShips {

    public static void placeShip(String[][] card, int length) {
        Random rand = new Random();
        int x = rand.nextInt(9);
        int y = rand.nextInt(9);
        boolean horizontal = rand.nextBoolean();

        while (!checkCoordinates(x, y, horizontal, length) || !checkLocationShips(x, y, card, horizontal, length)) {
            x = rand.nextInt(10);
            y = rand.nextInt(10);
            horizontal = rand.nextBoolean();
        }

        if (horizontal) {
            for (int i = 0; i < length; i++) {
                card[y][x + i] = " X ";
            }
        } else {
            for (int i = 0; i < length; i++) {
                card[y + i][x] = " X ";
            }
        }
    }
}
