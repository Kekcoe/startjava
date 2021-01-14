package com.startjava.lesson_2_3.calculator;

public class Calculator {
	 private  int firstNumb;
	 private  int secondNumb;
	 private char sign;

	 public Calculator(String mathExpression) {
		 String[] arrExpression = mathExpression.split(" ");
		 firstNumb = Integer.parseInt(arrExpression[0]);
		 sign = arrExpression[1].charAt(0);
		 secondNumb = Integer.parseInt(arrExpression[2]);
	 }

		 public void calculate() {
			 switch (sign) {
				 case '+' -> System.out.println(firstNumb + " + " + secondNumb + " = " + Math.addExact(firstNumb, secondNumb));
				 case '-' -> System.out.println(firstNumb + " - " + secondNumb + " = " + (firstNumb - secondNumb));
				 case '*' -> System.out.println(firstNumb + " * " + secondNumb + " = " + (firstNumb * secondNumb));
				 case '/' -> System.out.println(firstNumb + " / " + secondNumb + " = " + Math.floorDiv(firstNumb, secondNumb));
				 case '^' -> System.out.println(firstNumb + " ^ " + secondNumb + " = " + Math.pow(firstNumb, secondNumb));
				 case '%' -> System.out.println(firstNumb + " % " + secondNumb + " = " + (firstNumb % secondNumb));
				 default -> System.out.println("Введи знак мат.операции " + " + " + " - " + " * " + " / " + " ^ " + " % ");
			 }
		}

}
