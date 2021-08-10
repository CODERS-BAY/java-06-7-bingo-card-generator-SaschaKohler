package com.sksoft;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Random rand = new Random();


        int[][] Bingo = new int[5][5];
        int max = 15;
        int min = max - 14;

        int number;

        for (int k = 0; k < 5; k++) {
            System.out.println(" B  I  N  G  O  ");
            for (int j = 4; j >= 0; j--) {
                for (int i = 0; i < Bingo.length; i++) {
                    Bingo[i][j] = rand.nextInt(max - min) + min;
                    if (i == 2 && j == 2) {
                        System.out.printf("-- ");
                    } else {
                        System.out.printf("%2d ", Bingo[i][j]);
                    }
                    max = max + 15;
                    min = max - 14;
                }
                System.out.println();
                max = 15;
                min = max - 14;
            }
            System.out.println();
            System.out.println();
        }
/*
        System.out.println(Bingo[0][4] + " " + Bingo[1][4] + " " + Bingo[2][4] + " " + Bingo[3][4] + " " + Bingo[4][4]);
        System.out.println(Bingo[0][3] + " " + Bingo[1][3] + " " + Bingo[2][3] + " " + Bingo[3][3] + " " + Bingo[3][3]);
        System.out.println(Bingo[0][2] + " " + Bingo[1][2] + " " + Bingo[2][2] + " " + Bingo[3][2] + " " + Bingo[4][4]);
        System.out.println(Bingo[0][1] + " " + Bingo[1][1] + " " + Bingo[2][1] + " " + Bingo[3][1] + " " + Bingo[4][1]);
        System.out.println(Bingo[0][0] + " " + Bingo[1][0] + " " + Bingo[2][0] + " " + Bingo[3][0] + " " + Bingo[4][0]);
*/

    }
}
