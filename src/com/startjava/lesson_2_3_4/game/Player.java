package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

class Player {
    private String name;
    private int[] playerTries = new int[10];


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getPlayerTries() {
        return Arrays.copyOf(playerTries, 10);
    }

    public void setPlayerTries(int index, int userNumber) {
        playerTries[index] = userNumber;
    }


}