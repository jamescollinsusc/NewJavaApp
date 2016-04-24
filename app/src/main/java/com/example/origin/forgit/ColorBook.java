package com.example.origin.forgit;

import java.util.Random;

public class ColorBook {

    private FactBook mFactBook = new FactBook();
    private int mColorArray[] = {
            0xFF39add1,
            0xFF3079ab,
            0xFFc25975,
            0xFFe15258,
            0xFFf9845b,
            0xFF838cc7,
            0xFF7d669e,
            0xFF53bbb4,
            0xFFe0ab18,
            0xFF637a91,
            0xFFf092b0,
            0xFFb7c0c7
            // light blue
            // dark blue
            // mauve
            // red
            // orange
            // lavender
            // purple
            // aqua
            // green
            // mustard
            // dark gray
            // pink
            // light gray
    };
    public int get_color(){
        Random getRandom = new Random();
        int randomNumber = getRandom.nextInt(mFactBook.get_size());
        return mColorArray[randomNumber];
    }
}
