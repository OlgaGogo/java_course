package chapter4;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]){

        //Get number of items to scan
        System.out.println("Enter the number of items you want to scan:");
        Scanner read = new Scanner(System.in);
        double quantity = read.nextDouble();

        double total = 0;

        //Create a loop to iterate through all the items and accumulate the costs
        for (int i = 0; i<quantity; i++){

            System.out.println("Enter the price of the item:");
            double price = read.nextDouble();

            total = total + price;
        }

        System.out.println("Your total is $" + total);
        read.close();
    }
}
