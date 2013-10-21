package com.zzxhdzj.tdd;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test_gutter_game() throws Exception{
        Game game = new Game();
        for (int i=0;i<20;i++) {
            game.roll(0);
        }
        assertEquals(0,game.score());
    }
    @Test
    public void test_all_ones()throws Exception{
        Game game = new Game();
        for (int i = 0;i<20;i++){
            game.roll(i);
            assertEquals(20,game.score());
        }
    }
}
