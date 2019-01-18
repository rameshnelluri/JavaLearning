package Assignments;

import java.util.Scanner;

public class VenusYears {
    public static void main(String[] args) {
        String userName;
        int birthYear, currentYear = 2018, currentAge;
        double venusYears;

        Scanner sc = new Scanner(System.in);

        System.out.print("What's your Name: ");
        userName = sc.nextLine();

        System.out.print("What's your Birth Year: ");
        birthYear = sc.nextInt();


        currentAge = currentYear-birthYear;

        venusYears = currentAge / 0.62;

        System.out.println("Dear "+userName+", in "+currentYear+" your age will be "+currentAge+". And your age is "+venusYears+" in Venus Years");

    }
}
