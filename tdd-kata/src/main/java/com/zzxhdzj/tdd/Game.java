package com.zzxhdzj.tdd;

/**
 * Created with IntelliJ IDEA.
 * User: yangning.roy
 * Date: 10/22/13
 * Time: 1:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    private int score = 0;
    private int[] rolls = new int[21];
    private int currentRoll = 0;
    public void roll(int pins) {
        score +=pins;
        rolls[currentRoll++] = pins;
    }

    public int score() {
        return score;
    }
}
