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
        int i = 0; //bad frame
        for (int frame = 0;frame<10;frame++){
            if(rolls[i]+rolls[i+1]==10){//spare
             score += 10+rolls[i+2];
                i += 2;
            }else{
              score += rolls[i]+rolls[i+1];
                i += 2;
            }
        }
        return score;
    }
}
