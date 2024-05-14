package org.example.general;

import java.util.Scanner;

public class ManualGetParameters {


    public static Parameters getManualParameters(int length) {
        System.out.println("Укажи координаты для корабля с количеством палуб: " + length);
        System.out.println("Положения корабля: (варианты: вертикально = 1/горизонтально = 2)");

        Scanner scanner = new Scanner(System.in);

        String l = scanner.nextLine();
        boolean horizontal = !l.equals("1");

        System.out.println("Координата x: (алфавит от A до J)");
        String getX = scanner.nextLine();
        int x = 0;
        //valueOf
        for (Coordinates coordinates : Coordinates.values()) {
            if (coordinates.name().equals(getX)) {
                x = coordinates.getNumber();
            }
        }

        System.out.println("Координата y: (цифры от 1 до 10)");
        int y = scanner.nextInt();

        System.out.println(x + ", " + (y - 1) + ", " + horizontal + ", " + length);
        return new Parameters(x, y - 1, length, horizontal);
    }
}
