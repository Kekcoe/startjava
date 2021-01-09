package com.startjava.lesson_2_3.calculator;

 public class Calculator {
	
		private int firstNumb;
		private int secondNumb;
		private char sign;

		public void setFirstNumb(int firstNumb) {
			this.firstNumb = firstNumb;
		}

		public void setSecondNumb(int secondNumb) {
			this.secondNumb = secondNumb;
		}

		public void setSign(char sign) {
			this.sign = sign;
		}

		public void calculate() {
			switch(sign) {
				case '+':
					System.out.println(firstNumb + " + " + secondNumb + " = " + (firstNumb + secondNumb));
					break;
				case '-':
					System.out.println(firstNumb + " - " + secondNumb + " = " + (firstNumb - secondNumb));
					break;
				case '*':
					System.out.println(firstNumb + " * " + secondNumb + " = " + (firstNumb * secondNumb));
					break;
				case '/':
					System.out.println(firstNumb + " / " + secondNumb + " = " + (firstNumb / secondNumb));
					break;
				case '^':
					System.out.println(firstNumb + " ^ " + secondNumb + " = " + pow(firstNumb, secondNumb));
					break;
				case '%':
					System.out.println(firstNumb + " % " + secondNumb + " = " + (firstNumb % secondNumb));
					break;
				default:
					System.out.println("Введи знак мат.операции " + " + " + " - " + " * " + " / " + " ^ " + " % ");
			}
		}

		//exponentiation
		private int pow(int firstNumb, int secondNumb) {
			int result = 1;
			for (int i = 0; i < secondNumb; i++) {
				result *= firstNumb;
			}
			return result;
		}
	}
