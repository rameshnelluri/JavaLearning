package Assignments;

import java.util.Scanner;

public class PlayWithStrings {
    public static void main(String[] args) {
        //Variable Declaration
        String firstInput, secondInputWord1, secondInputWord2, secondInputWord3;

        //Scanner initiation
        Scanner sc = new Scanner(System.in);

        //Read input from keyboard
        System.out.print("Please enter a 3 word sentence: ");
        firstInput = sc.nextLine();

        //Printing the length of the string using length function
        System.out.println("Number of characters in the sentence: "+firstInput.length());

        //Printing first character of the given String
        System.out.println("The first letter of the sentence: "+firstInput.charAt(0));

        //Printing the first word - finding the first occurence of " " (Space) and printing until there
        System.out.println("The first letter of the sentence: "+firstInput.substring(0,firstInput.indexOf(" ")));

        //Printing the upper case version of given string
        System.out.println("The sentence in capital letters: "+firstInput.toUpperCase());

        //Read input from keyboard
        System.out.print("Please enter a 3 word sentence: ");
        // This can be written in loops also
        //Please note read line by line, we should use .next() instead of .nextLine()
        secondInputWord1 = sc.next();
        secondInputWord2 = sc.next();
        secondInputWord3 = sc.next();

        //Printing the length of the string using length function
        System.out.println("Number of characters in word 1: "+secondInputWord1.length());
        System.out.println("Number of characters in word 2: "+secondInputWord2.length());
        System.out.println("Number of characters in word 3: "+secondInputWord3.length());

        //Printing first character of the given String's words
        System.out.println("he first letter of word 1: "+secondInputWord1.charAt(0));
        System.out.println("he first letter of word 2: "+secondInputWord2.charAt(0));
        System.out.println("he first letter of word 3: "+secondInputWord3.charAt(0));

        System.out.println("The sentence in capital letters: "+secondInputWord1.toUpperCase()+" "+secondInputWord2.toUpperCase()+" "+secondInputWord3.toUpperCase());

     /*   The first letter of the sentence: P
        The first word of the sentence: Programming
        The sentence in capital letters: PROGRAM IS FUN
        Give a second sentence of 3 words: practice is necessary
        Number of characters in word 1: 7
        Number of characters in word 2: 2
        Number of characters in word 3: 12
        The first letter of word 1: o
        The first letter of word 2: i
        The first letter of word 3: n
        The sentence in capital letters: EXERCISE IS NECESSARY

        //Read height from keyboard
        System.out.print("What's your height in Centimeters: ");
        height = sc.nextInt();

        //Calculate Height in meters
        heightMeters = height/100;
        // Calculate BMI
        bmi = weight / (heightMeters * heightMeters);

        System.out.println("BMI: "+bmi);*/
    }
}
