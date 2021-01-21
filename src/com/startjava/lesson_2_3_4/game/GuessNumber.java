package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private int secretNumber;
    private final Player player1;
    private final Player player2;
    private int count;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Random random = new Random();
        secretNumber = random.nextInt(101);
        do {
            inputNumber(player1);
            if (compareNumber(player1)) {
                break;
            }
            inputNumber(player2);
            if (compareNumber(player2)) {
                break;
            }
            count++;
            player1.setAttempt(count);
            player2.setAttempt(count);
            if (count == 10) {
                System.out.println(" Yours tries has over");
                break;
            }
        } while (true);
        showPlayerNumbers(player1);
        showPlayerNumbers(player2);
        count = 0;
        player1.fillZero();
        player2.fillZero();
        System.out.println(Arrays.toString(player1.getEnteredNumber()));
    }

    private void inputNumber(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.println(player.getName() + " input your number ");
        player.setEnteredNumber(count, sc.nextInt());
    }

    private boolean compareNumber(Player player) {
        if (player.getEnteredNumber()[count] == secretNumber) {
            System.out.println("Player " + player.getName() + " guessed the number from " + (player.getAttempt() + 1) + " try");
            return true;
        }
        String result = player.getEnteredNumber()[count] > secretNumber ? "больше" : "меньше";
        System.out.println(player.getName() + " число введенное вами " + result + " того, что загадал компьютер");
        return false;
    }

    private void showPlayerNumbers(Player player) {
        System.out.println(player.getName());
        player.getEnteredNumber();
        for (int number : Arrays.copyOf(player.getEnteredNumber(), player.getAttempt() + 1)) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}