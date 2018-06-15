package com.stepwisedesign;

import java.util.Scanner;

public class UserInput {

    /* class used for asking for user input and retuning an int*/

    //create scanner object
    private Scanner scanner = new Scanner(System.in);

    //create var to hold display message
    private String message = "Pick a number to compare with random number: ";

    //method for getting guessed number and displaying message
    public int requestInput(){

        System.out.println(message);
        int guessedNumber = scanner.nextInt();

        //return int to calling function
        return guessedNumber;
    }

}
