package Assignments;

import sun.awt.Symbol;

import java.util.Scanner;

public class PlayWithStringsAdvanced {
    public static void main(String[] args) {
        //Variable Declaration
        String firstInput, secondInputWord1, secondInputWord2, secondInputWord3, thirdInput;

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

        Scanner sc1 = new Scanner(System.in);
        //Read input from keyboard
        System.out.print("Please enter a 3 word sentence: ");
        thirdInput = sc1.nextLine();

        if ( firstInput.equals(thirdInput) ){
            System.out.println("Sentence 3 is equal to Sentence 1");
        } else if(firstInput.toUpperCase().equals(thirdInput.toUpperCase())){
            System.out.println("Sentence 3 is equal to Sentence 1 when we ignore case");
        } else {
            System.out.println("Sentence 3 is not equal to Sentence 1");
        }

        int i;
        String checkString;

        for(i=1; i<=3;i++){
            System.out.print("Enter String you wanted to Check: ");
            checkString=sc.next();
            if(thirdInput.contains(checkString)){
                System.out.println("the word "+checkString+" does appear in sentence 3");
            } else {
                System.out.println("the word "+checkString+" does not appear in sentence 3");
            }
        }

    }
}
