package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Game on \nYou have 10 tries to guess");
        Scanner sc = new Scanner(System.in);

        System.out.print("Player one, input your name: ");
        String userName1 = sc.next();

        System.out.print("Player two, input your name: ");
        String userName2 = sc.next();

        String userExitAnswer;
        Player player1 = new Player(userName1);
        Player player2 = new Player(userName2);
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.play();
            do {
                System.out.print("Do you want to continue? [yes/no]: ");
                userExitAnswer = sc.next();
            } while (!userExitAnswer.equals("yes") && !userExitAnswer.equals("no"));
        } while (!userExitAnswer.equals("no"));
    }
}
