package com.zzxhdzj.tdd;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class BowlingGameTest {
    private Game game;

    @Before
    public void setUp() throws Exception{
        game = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i=0;i<n;i++) {
            game.roll(pins);
        }
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }


    @Test
    public void test_gutter_game() throws Exception{
        int n = 20;
        int pins = 0;
        rollMany(n, pins);
        assertEquals(0,game.score());
    }

    @Test
    public void test_all_ones()throws Exception{
        int n = 20;
        int pins = 1;
        rollMany(n, pins);
        assertEquals(20,game.score());

    }

    @Test
    public void test_one_spare() throws Exception{
        rollSpare();
        game.roll(3);
        rollMany(17, 0);
        assertEquals(16, game.score());
    }

    @Test
    public void test_one_strike() throws Exception{
        game.roll(10);
        game.roll(3);
        game.roll(4);
        rollMany(16,0);
        assertEquals(24, game.score());
    }

}
