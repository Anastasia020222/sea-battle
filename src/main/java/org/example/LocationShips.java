package org.example;

public class LocationShips {

    public static boolean checkLocationShips(int x, int y, String[][] card, boolean horizontal, int length) {
        int X0;
        int Y0;
        int X1;
        int Y1;

        //если координата расположена на границе
        if (x - 1 < 0) {
            X0 = x;
        } else {
            X0 = x - 1;
        }

        if (y - 1 < 0) {
            Y0 = y;
        } else {
            Y0 = y - 1;
        }

        if (horizontal) {
            Y1 = Math.min(y + 1, 9);
            X1 = Math.min(x + length, 9);
        } else {
            X1 = Math.min(x + 1, 9);
            Y1 = Math.min(y + length, 9);
        }

        //проверяем, что при расположении корабля, рядом нет кораблей
        for (int i = Y0; i <= Y1; i++) {
            for (int j = X0; j <= X1; j++) {
                if (card[i][j].equals(" X ")) {
                    return false;
                }
            }
        }
        return true;
    }

    //проверяем, что длина корабля не выходит за границу карты
    public static boolean checkCoordinates(int x, int y, boolean horizontal, int length) {
        if (horizontal) {
            return x + length <= 9;
        } else {
            return y + length <= 9;
        }
    }
}
