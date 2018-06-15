package com.stepwisedesign;

public class RandomNumber {

    /*class to generate a random number */

    //create and return an int

    public int generateRandomNumber(){

        double randomPick = Math.random();

        randomPick = randomPick * 6;
        randomPick = randomPick + 1;

        return (int) randomPick;
    }
}
