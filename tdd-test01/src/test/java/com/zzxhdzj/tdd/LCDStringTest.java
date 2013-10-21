package com.zzxhdzj.tdd;

import com.zzxhdzj.tdd.LCDString;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class LCDStringTest
{
    @Test
    public void hitch_hiker() {
        String[] str ={
        "._. ... ._.",
        "|_| ..| |.|",
        "..| ..| |_|"
        };
        LCDString lcdString = new LCDString();
        List<String> stringList = lcdString.display(910);
        for (int i = 0; i < stringList.size(); i++) {
            assertEquals(str[i],stringList.get(i));
        }
    }
}
