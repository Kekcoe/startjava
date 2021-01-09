package com.startjava.lesson_2_3.calculator;
import com.startjava.lesson_2_3.calculator.Calculator;
import java.util.Scanner;

class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);

		String userAnswer = "yes";
		while(userAnswer.equals("yes")) {
			System.out.print("Введите первое число: ");
			calc.setFirstNumb(sc.nextInt());

			System.out.print("Введите знак математической операции: ");
			calc.setSign(sc.next().charAt(0));

			System.out.print("Введите второе число: ");
			calc.setSecondNumb(sc.nextInt());

			System.out.println("");
			
			calc.calculate();
			do {
				System.out.print("Хотите продолжить вычисления? [yes/no]: ");
				userAnswer = sc.next();
			} while(!userAnswer.equals("yes") && !userAnswer.equals("no"));
		}
	}
}