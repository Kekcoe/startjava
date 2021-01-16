package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    int secretNumber;
    private final Player player1;
    private final Player player2;
    private int playerTry;


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
            playerTry++;
            if (playerTry == 10) {
                System.out.println(" Yours tries has over");
                break;
            }
        } while (true);

        showPlayerNumbers(player1);
        showPlayerNumbers(player2);
        playerTry = 0;
        Arrays.fill(player1.getPlayerTries(), 0);
        Arrays.fill(player2.getPlayerTries(), 0);
    }


    public void inputNumber(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.println(player.getName() + " input your number ");
        player.setPlayerTries(playerTry, sc.nextInt());
    }

    public boolean compareNumber(Player player) {
        if (player.getPlayerTries()[playerTry] == secretNumber) {
            System.out.println("Player " + player.getName() + " guessed the number from " + playerTry + " try");
            return true;
        }
        String result = player.getPlayerTries()[playerTry] > secretNumber ? "больше" : "меньше";
        System.out.println(player.getName() + " число введенное вами " + result + " того, что загадал компьютер");
        return false;
    }

    private void showPlayerNumbers(Player player) {
        System.out.println(player.getName());
        for (int i = 0; i < playerTry; i++) {
            System.out.print(player.getPlayerTries()[i] + " ");
        }
        System.out.println();
    }
}