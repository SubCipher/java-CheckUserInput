package com.stepwisedesign;

public class Main {

    public static void main(String[] args) {
        //create instance of each class
        UserInput userInput= new UserInput();
        RandomNumber randomNumber = new RandomNumber();
        CompareNumbers compareNumbers = new CompareNumbers();

        //use methods from class instances for local var assignment
        int guessedNumber = userInput.requestInput();
        int anyNumber = randomNumber.generateRandomNumber();

        //declear var
        boolean resultsOfComparison;

        //initialize var by assigning it the result (true/false of comaparison
        resultsOfComparison = compareNumbers.compareTwoInts(guessedNumber,anyNumber);

        System.out.println(resultsOfComparison);

            //if this is true
        if (resultsOfComparison) {
            System.out.println("You WIN!!");
        } else {
            System.out.println(anyNumber + " is the random number " );
        }
    }
}
