package com.startjava.lesson_2_3_4.game;

class Player {
    private String name;
    private int[] tries = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getTries() {
        return tries;
    }

    public void setPlayerTries(int index, int userNumber) {
        tries[index] = userNumber;
    }
}