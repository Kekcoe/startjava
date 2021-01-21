package com.startjava.lesson_2_3_4.game;
import java.util.Arrays;

class Player {
    private String name;
    private int[] enteredNumber = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumber() {
        return enteredNumber;
    }

    public void setEnteredNumber(int attempt, int playerNumber) {
        enteredNumber[attempt] = playerNumber;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void fillZero() {
        Arrays.fill(this.enteredNumber, 0, this.attempt + 1,0);
    }
}
