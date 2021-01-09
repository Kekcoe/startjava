package com.startjava.lesson_1.calculator;

class Calculator {
	public static void main(String[] args) {
		char sign = '^';
		int firstNumb = 8;
		int secondNumb = 5;

		if(sign == '+') {
			System.out.println(firstNumb + " + " + secondNumb + " = " + (firstNumb + secondNumb));
		} else if(sign == '-') {
			System.out.println(firstNumb + " - " + secondNumb + " = " + (firstNumb - secondNumb));
		} else if(sign == '*') {
			System.out.println(firstNumb + " * " + secondNumb + " = " + (firstNumb * secondNumb));
		} else if(sign == '/') {
			System.out.println(firstNumb + " / " + secondNumb + " = " + (firstNumb / secondNumb));
		} else if(sign == '^') {
			int res = 1;
			for(int i = 0; i < secondNumb; i++){
				res *= firstNumb;
			}
			System.out.println(firstNumb + " ^ " + secondNumb + " = " + (res));
		} else if(sign == '%') {
			System.out.println(firstNumb + " % " + secondNumb + " = " + (firstNumb % secondNumb));
		}
	}
}