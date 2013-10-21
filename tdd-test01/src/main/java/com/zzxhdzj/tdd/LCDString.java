package com.zzxhdzj.tdd;

import java.util.ArrayList;
import java.util.List;

/*
._.   ...   ._.   ._.   ...   ._.   ._.   ._.   ._.   ._.
|.|   ..|   ._|   ._|   |_|   |_.   |_.   ..|   |_|   |_|
|_|   ..|   |_.   ._|   ..|   ._|   |_|   ..|   |_|   ..|

*/
public class LCDString {

    private String[][] lcdNums = {
            {"._.", "|.|", "|_|"},
            {"...", "..|", "..|"},
            {"._.", "._|", "|_."},
            {"._.", "._|", "._|"},
            {"...", "|_|", "..|"},
            {"._.", "|_.", "._|"},
            {"._.", "|_.", "|_|"},
            {"._.", "..|", "..|"},
            {"._.", "|_|", "|_|"},
            {"._.", "|_|", "..|"}
    };



    public List<String> display(int number) {
        List<String> stringList = new ArrayList<String>();
        char[]charNums = String.valueOf(number).toCharArray();
        for(int line = 0; line < 3;line++){

            StringBuffer buffer = new StringBuffer();
            for (int j = 0; j < charNums.length;) {
                char charNum = charNums[j];
                int bit = charNum - '0';
                buffer.append(lcdNums[bit][line]);
                if(++j<charNums.length){
                    buffer.append(" ");
                }
            }
            stringList.add(buffer.toString());
        }

        return stringList;
    }
}
