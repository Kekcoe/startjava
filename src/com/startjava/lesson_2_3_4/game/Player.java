package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

class Player {
    private String name;
    private int[] tries = new int[10];
    int lastNumber;
    int attempt;

    public Player(String name) {
        this.name = name;
    }

    public int getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(int lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getName() {
        return name;
    }

    public int[] getTries() {
        return tries;
    }

    public void setTries(int index, int playerNumber) {
        tries[index] = playerNumber;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void outputTries(int[] tries, int attempt) {
        for (int number : Arrays.copyOf(tries, attempt + 1)) {
            System.out.print(number + " ");
        }
    }
}
