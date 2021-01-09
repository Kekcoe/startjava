package com.startjava.lesson_1.game;

class GuessNumb {
	public static void main(String[] args) {
		int secretNumber = 55;
		int userNumb = 47;
		System.out.println("");

		if(userNumb < secretNumber) {
			while(userNumb != secretNumber - 1) {
				userNumb++;
				System.out.println("Введенное вами число " + userNumb + " меньше того, что загадал компьютер");
			}
		} else if (userNumb > secretNumber) {
			while(userNumb != secretNumber + 1) {
				userNumb--;
				System.out.println("Введенное вами число " + userNumb + " больше того, что загадал компьютер");
			}
		}
		System.out.println("Вы угадали " + secretNumber);
	}
}
