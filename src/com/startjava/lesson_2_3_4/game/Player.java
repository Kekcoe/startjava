package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

class Player {
    private String name;
    private int[] enteredNumbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempt + 1);
    }

    public void setEnteredNumbers(int playerNumber) {
        enteredNumbers[attempt] = playerNumber;
    }


    public void fillZero() {
        Arrays.fill(enteredNumbers, 0, attempt + 1, 0);
    }
}