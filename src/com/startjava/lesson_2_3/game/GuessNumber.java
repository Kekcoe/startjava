package com.startjava.lesson_2_3.game;

import com.startjava.lesson_2_3.game.Player;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
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
                System.out.println("Player " + player1.getName() + " guessed the number from " + index1 + " try");
                System.out.println(Arrays.toString(player1Tries));
                break;
            } else if (player1Tries[index1] < secretNumber) {
                System.out.println(player1.getName() + " " + "введенное вами число " + player1Tries[index1] + " меньше того, что загадал компьютер");
            } else if (player1Tries[index1] > secretNumber) {
                System.out.println(player1.getName() + " " + "введенное вами число " + player1Tries[index1] + " больше того, что загадал компьютер");
            }
            index1++;
            System.out.print(player2.getName() + " input your number ");
            int userNumb2 = sc.nextInt();
            if (userNumb2 == secretNumber) {
                System.out.println(player2.getName() + " You guessed the number ");
                break;
            } else if (userNumb2 < secretNumber) {
                System.out.println(player2.getName() + " " + " введенное вами число " + userNumb2 + " меньше того, что загадал компьютер");
            } else if (userNumb2 > secretNumber) {
                System.out.println(player2.getName() + " " + "введенное вами число " + userNumb2 + " больше того, что загадал компьютер");
            }
        }
    }
}