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

    @Test
    public void test_gutter_game() throws Exception{
        for (int i=0;i<20;i++) {
            game.roll(0);
        }
        assertEquals(0,game.score());
    }
    @Test
    public void test_all_ones()throws Exception{
        for (int i = 0;i<20;i++){
            game.roll(1);
        }
        assertEquals(20,game.score());

    }
}
