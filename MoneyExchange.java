package Assignments;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args){
        int currencyType, currencyAmount;

        double euroValueNoFee, euroValueWithFee, transFee;

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose Currency (1 = US dollar, 2 = GB pounds, 3 = Yen): ");
        currencyType = sc.nextInt();

        System.out.print("Amount to be exchanged (only integers): ");
        currencyAmount = sc.nextInt();

        switch(currencyType) {
            case 1:
                euroValueNoFee = currencyAmount * 0.88;
                transFee = euroValueNoFee * 1.5/100;
                if (transFee<2){
                    transFee = 2;
                }else if(transFee>15){
                    transFee=15;
                }
                euroValueWithFee=euroValueNoFee-transFee;
                System.out.println("For " + currencyAmount + " Dollars you will receive " + euroValueNoFee + " Euro");
                System.out.println("The transaction costs are "+transFee+" Euro");
                System.out.println("You will receive "+euroValueWithFee+" Euro");
                break;
            case 2:
                euroValueNoFee = currencyAmount * 1.14;
                transFee = euroValueNoFee * 1.5/100;
                if (transFee<2){
                    transFee = 2;
                }else if(transFee>15){
                    transFee=15;
                }
                euroValueWithFee=euroValueNoFee-transFee;
                System.out.println("For " + currencyAmount + " Gbp you will receive " + euroValueNoFee + " Euro");
                System.out.println("The transaction costs are "+transFee+" Euro");
                System.out.println("You will receive "+euroValueWithFee+" Euro");
                break;
            case 3:
                euroValueNoFee = currencyAmount * 0.0078;
                transFee = euroValueNoFee * 1.5/100;
                if (transFee<2){
                    transFee = 2;
                }else if(transFee>15){
                    transFee=15;
                }
                euroValueWithFee=euroValueNoFee-transFee;
                System.out.println("For " + currencyAmount + " Yen you will receive " + euroValueNoFee + " Euro");
                System.out.println("The transaction costs are "+transFee+" Euro");
                System.out.println("You will receive "+euroValueWithFee+" Euro");
                break;
            default:
                System.out.println("Wrong currency choice");
        }
    }

}
