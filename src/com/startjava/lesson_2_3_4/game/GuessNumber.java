package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private final Player player1;
    private final Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int[] playerResult(int[] playerTries, int indexArray) {
        int[] playerResult = Arrays.copyOf(playerTries, indexArray);
        return playerResult;
    }

    public void play() {
        Random random = new Random();
        int secretNumber = random.nextInt((100) + 1);
        Scanner sc = new Scanner(System.in);
        int[] player1Tries = new int[10];
        int[] player2Tries = new int[10];
        int index1 = 0;
        int index2 = 0;
        while (true) {
            System.out.print(player1.getName() + " input your number ");
            player1Tries[index1] = sc.nextInt();
            if (player1Tries[index1] == secretNumber) {
                index1++;
                System.out.println("Player " + player1.getName() + " guessed the number from " + index1 + " try");
                System.out.println(player2.getName() + " " + Arrays.toString(playerResult(player2Tries, index2)));
                System.out.println(player1.getName() + " " + Arrays.toString(playerResult(player1Tries, index1)));
                break;
            } else if (player1Tries[index1] < secretNumber) {
                System.out.println(player1.getName() + " " + "введенное вами число " + player1Tries[index1] + " меньше того, что загадал компьютер");
            } else if (player1Tries[index1] > secretNumber) {
                System.out.println(player1.getName() + " " + "введенное вами число " + player1Tries[index1] + " больше того, что загадал компьютер");
            }
            index1++;
            if (index1 == 10) {
                System.out.println(player1.getName() + " has out of tries " + player2.getName() + " won");
                System.out.println(player1.getName() + (Arrays.toString(playerResult(player1Tries, index1))));
                System.out.println(player2.getName() + (Arrays.toString(playerResult(player2Tries, index2))));
                break;
            }

            System.out.print(player2.getName() + " input your number ");
            player2Tries[index2] = sc.nextInt();
            if (player2Tries[index2] == secretNumber) {
                index2++;
                System.out.println("Player " + player2.getName() + " guessed the number from " + index2 + " try");
                System.out.println(player1.getName() + " " + Arrays.toString(playerResult(player1Tries, index1)));
                System.out.println(player2.getName() + " " + Arrays.toString(playerResult(player2Tries, index2)));
                break;
            } else if (player1Tries[index2] < secretNumber) {
                System.out.println(player2.getName() + " " + "введенное вами число " + player2Tries[index2] + " меньше того, что загадал компьютер");
            } else if (player1Tries[index2] > secretNumber) {
                System.out.println(player2.getName() + " " + "введенное вами число " + player2Tries[index2] + " больше того, что загадал компьютер");
            }
            index2++;
            if (index2 == 10) {
                System.out.println(player2.getName() + " has out of tries " + player1.getName() + " won");
                System.out.println(player2.getName() + (Arrays.toString(playerResult(player2Tries, index2))));
                System.out.println(player1.getName() + (Arrays.toString(playerResult(player1Tries, index1))));
                break;
            }
        }
    }
}