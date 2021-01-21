package com.startjava.lesson_2_3_4.game;
import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Game on! \nYou have 10 tries to guess");
        Scanner sc = new Scanner(System.in);

        System.out.print("Player one, input your name: ");
        Player player1 = new Player(sc.next());

        System.out.print("Player two, input your name: ");
        Player player2 = new Player(sc.next());

        String playerExitAnswer;
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.play();
            do {
                System.out.print("Do you want to continue? [yes/no]: ");
                playerExitAnswer = sc.next();
            } while (!playerExitAnswer.equals("yes") && !playerExitAnswer.equals("no"));
        } while (!playerExitAnswer.equals("no"));
    }
}
