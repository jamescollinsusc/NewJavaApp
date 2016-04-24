package com.example.origin.forgit;

import java.util.Random;


public class FactBook {
    //fields and member variables
    Pair one = new Pair();
    Pair two = new Pair();
    Pair three = new Pair();
    Pair four = new Pair();
    Pair five = new Pair();
    Pair six = new Pair();
    Pair seven = new Pair();
    Pair eight = new Pair();
    Pair nine = new Pair();
    Pair ten = new Pair();
    Pair eleven = new Pair();

    private Pair[] mFacts = {
        one,
        two,
        three,
        four,
        five,
        six,
        seven,
        eight,
        nine,
        ten,
        eleven
    };

    FactBook(){
        one.set_first("Ants stretch when they wake up in the morning.");
        two.set_first("Ostriches can run faster than horses.");
        three.set_first("Olympic gold medals are actually made mostly of silver.");
        four.set_first("You are born with 300 bones; by the time you are an adult you will have 206.");
        five.set_first("It takes about 8 minutes for light from the Sun to reach Earth.");
        six.set_first("Some bamboo plants can grow almost a meter in just one day.");
        seven.set_first("The state of Florida is bigger than England.");
        eight.set_first("Some penguins can leap 2-3 meters out of the water.");
        nine.set_first("On average, it takes 66 days to form a new habit.");
        ten.set_first("Mammoths still walked the earth when the Great Pyramid was being built.");
        eleven.set_first("You a stupid hoe, you a, you a stupid hoe!");
        one.set_second(0xFF39add1);
        two.set_second(0xFF3079ab);
        three.set_second(0xFFc25975);
        four.set_second(0xFFe15258);
        five.set_second(0xFFf9845b);
        six.set_second(0xFF838cc7);
        seven.set_second(0xFF7d669e);
        eight.set_second(0xFF53bbb4);
        nine.set_second(0xFFe0ab18);
        ten.set_second(0xFF637a91);
        eleven.set_second(0xFFf092b0);
    }

    public int make_rand() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(mFacts.length);
    }

    public Pair get_fact(){
        return mFacts[make_rand()];
    }
}
