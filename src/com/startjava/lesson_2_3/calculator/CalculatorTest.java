package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mathExpression;
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            do {
                System.out.println("Введите  выражение по типу a + b через пробел: ");
                mathExpression = sc.nextLine();
            } while (mathExpression == null);
            Calculator calc = new Calculator(mathExpression);
            System.out.println(calc.calculate());
            do {
                System.out.print("Do you want to continue? [yes/no]: ");
                userAnswer = sc.next();
                sc.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        }
    }
}