package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] game = new String[10];
        System.out.println("whats your name");
        String name = scanner.nextLine();
        for (int i = 0; i < 4; i++) {


            System.out.println("pick a number between 0 and 9");
            int input = (scanner.nextInt());
            if (game[input] == null) {
                game[input] = name;
            }

            int computerguess = random.nextInt(10);
            if (game[computerguess] == null) {
                game[computerguess] = "comp";

            }
        } System.out.println(Arrays.toString(game));
    }
}