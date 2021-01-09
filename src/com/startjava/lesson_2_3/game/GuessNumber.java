package com.startjava.lesson_2_3.game;
import com.startjava.lesson_2_3.game.Player;
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
		while(true) {
			System.out.print(player1.getName() + " input your number ");
			int userNumb1 = sc.nextInt();
			if(userNumb1 == secretNumber) {
				System.out.println(player1.getName() + " Вы угадали число ");
				break;
			}else if(userNumb1 < secretNumber) {
				System.out.println(player1.getName() + " " + "введенное вами число " + userNumb1 + " меньше того, что загадал компьютер");
			} else if(userNumb1 > secretNumber) {
				System.out.println(player1.getName() + " " + "введенное вами число " + userNumb1 + " больше того, что загадал компьютер");
			}

			System.out.print(player2.getName() + " input your number ");
			int userNumb2 = sc.nextInt();
			if(userNumb2 == secretNumber) {
				System.out.println(player2.getName() + " Вы угадали число ");
				break;
			} else if(userNumb2 < secretNumber) {
				System.out.println(player2.getName() + " " + " введенное вами число " + userNumb2 + " меньше того, что загадал компьютер");
			} else if(userNumb2 > secretNumber) {
				System.out.println(player2.getName() + " " + "введенное вами число " + userNumb2 + " больше того, что загадал компьютер");
			}
		}
	}
}