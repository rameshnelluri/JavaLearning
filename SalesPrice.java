package Assignments;

import java.util.Scanner;

public class SalesPrice {
    public static void main(String[] args) {
        //Variable Declaration
        double price, marginPercent, priceExclBTW, priceLowBTW, priceFullBTW;

        //Scanner initiation
        Scanner sc = new Scanner(System.in);

        //Read price from keyboard
        System.out.print("Purchase Price: ");
        price = sc.nextDouble();

        //Read margin percentage from keyboard
        System.out.print("Profit Margin (in %): ");
        marginPercent = sc.nextDouble();

        //calculations
        priceExclBTW = price + (price * marginPercent /100);

        priceLowBTW = priceExclBTW + (priceExclBTW * 6/100);

        priceFullBTW = priceExclBTW + (priceExclBTW * 21/100);

        System.out.println("Sales price excluding BTW: "+priceExclBTW);

        System.out.println("Sales price excluding BTW: "+priceLowBTW);

        System.out.println("Sales price excluding BTW: "+priceFullBTW);
    }
}
