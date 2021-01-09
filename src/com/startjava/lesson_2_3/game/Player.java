package com.startjava.lesson_2_3.game;
class Player {
	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
	}

	public void setNubmer(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
}