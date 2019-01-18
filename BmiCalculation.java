package Assignments;

import java.util.Scanner;

public class BmiCalculation {
    public static void main(String[] args) {
        //Variable Declaration
        double heightMeters, bmi, height, weight;

        //Scanner initiation
        Scanner sc = new Scanner(System.in);

        //Read Weight from keyboard
        System.out.print("What's your Weight in Kilograms: ");
        weight = sc.nextInt();

        //Read height from keyboard
        System.out.print("What's your height in Centimeters: ");
        height = sc.nextInt();

        //Calculate Height in meters
        heightMeters = height/100;
        // Calculate BMI
        bmi = weight / (heightMeters * heightMeters);

        System.out.println("BMI: "+bmi);
    }
 }

