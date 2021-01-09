package com.startjava.lesson_1.cycle;

class Cycle {
	public static void main(String[] args) {
		System.out.println("");

		for(int i = 0; i < 21; i++) {
			System.out.print(i + " ");
		}

		System.out.println("");

		int a = 6;
		while(a > -8) {
			System.out.print(a + " ");
			a -= 2;
		}

		System.out.println("");

		int b = 10;
		int sum = 0;
		do {
			if(b % 2 > 0) {
				sum += b;
			}
		} while(++b < 21);
		System.out.println("Sum of odd numbers = " + sum);
	}
}