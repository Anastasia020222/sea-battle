package org.example.general;

public class PlaceShips implements CreateSeaBattle {

    @Override
    public void placeShip(String[][] card, int length, int x, int y, boolean horizontal) {
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
