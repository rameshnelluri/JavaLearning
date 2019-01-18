package Assignments;

import java.util.Scanner;

public class BmiAdvanced {
    public static void main(String[] args) {
        //Variable Declaration
        double heightMeters, bmi, height, weight, roundBMI;

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

        roundBMI=Math.round(bmi*10)/10.0;

        if(roundBMI<18.5){
            System.out.println("BMI: "+roundBMI+ " (Ondergewicht)");
        } else if(roundBMI<25.0) {
            System.out.println("BMI: "+roundBMI+ " (Gezond gewicht)");
        } else if(roundBMI<30.0) {
            System.out.println("BMI: "+roundBMI+ " (Overgewicht)");
        }else  {
            System.out.println("BMI: "+roundBMI+ " (Obesitas)");
        }
    }
}
