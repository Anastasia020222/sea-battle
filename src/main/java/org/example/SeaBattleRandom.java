package org.example;

import org.example.general.InitializeCard;

import java.util.Scanner;

public class SeaBattleRandom extends InitializeCard {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Как будем создавать карту: рандомно (введи 1) или вручную (введи 2)?");
        String option = scanner.nextLine();
        InitializeCard initializeCard = new InitializeCard();
        initializeCard.initializeCard(option);
    }
}