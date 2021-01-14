package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

class CalculatorTest  {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator(sc.nextLine());
		String userAnswer = "yes";

		while(userAnswer.equals("yes")) {
			do {
				System.out.println("Введите  выражение по типу a + b через пробел: ");
			} while(sc.nextLine().equals(""));

			calc.calculate();

			do {
				System.out.print("Хотите продолжить вычисления? [yes/no]: ");
				userAnswer = sc.next();
			} while(!userAnswer.equals("yes") && !userAnswer.equals("no"));
		}
		sc.close();
	}

}