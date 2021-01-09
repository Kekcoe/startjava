package com.startjava.lesson_1.conditional;

class ConditionalStatement {
	public static void main(String[] args) {
		System.out.println("");
		int age = 21;
		if(age > 20) {
			System.out.println("Age is more twenty");
		}

		String sex = "female";
		if(sex == "male") {
			System.out.println("Sex is male");
		}
		if(sex != "male") {
			System.out.println("Sex isn't male");
		}

		double height = 1.81;
		if(height > 1.80) {
			System.out.println("Height more then 1.80");
		} else {
			System.out.println("Height less then 1.80");
		}

		char firstNameLetter = 'I';
		if(firstNameLetter == 'M') {
			System.out.println("First letter of name is 'M'");
		} else if(firstNameLetter == 'I') {
			System.out.println("First letter of name is 'I'");
		} else {
			System.out.println("There isn't any name");
		}

	}

}