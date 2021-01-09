package com.startjava.lesson_2_3.game;
import com.startjava.lesson_2_3.game.GuessNumber;
import java.util.Scanner;

class GuessNumberTest {
	public static void main(String[] args) {
		System.out.println("Game on");
		Scanner sc = new Scanner(System.in);
		System.out.print("Player one, input your name: ");
		String userName1 = sc.next();
		System.out.print("Player two, input your name: ");
		String userName2 = sc.next();
		System.out.println("");
		String userAnswer = "yes";
		while(userAnswer.equals("yes")) {
			Player player1 = new Player(userName1);
			Player player2 = new Player(userName2);
			GuessNumber game = new GuessNumber(player1, player2);
			game.play();
			do {
				System.out.print("Хотите продолжить вычисления? [yes/no]: ");
				userAnswer = sc.next();
			} while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
		}
	}
}