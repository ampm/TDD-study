package com.zzxhdzj.tdd;

/**
 * Created with IntelliJ IDEA.
 * User: yangning.roy
 * Date: 10/22/13
 * Time: 1:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (rolls[rollIndex]==10) {
                score += 10 + rolls[rollIndex + 1]+rolls[rollIndex + 2];
                rollIndex++;
            } else if (isSpare(rollIndex)) {
                score += 10 + rolls[rollIndex + 2];
                rollIndex += 2;
            } else {
                score += rolls[rollIndex] + rolls[rollIndex + 1];
                rollIndex += 2;
            }
        }
        return score;
    }

    private boolean isSpare(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
    }
}
