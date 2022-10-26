package chapter3;

/*
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
 */

import java.util.Scanner;

public class OneDollarGame {
    public static void main(String args[]){
        //Initialize the variables
        double penny = .01;
        double nickel = .05;
        double dime = .1;
        double quarter = .25;
        int dollar = 1;

        //Store the variables
        System.out.println("Enter the number of pennies: ");
        Scanner read = new Scanner(System.in);
        double numberOfPennies= read.nextDouble();

        System.out.println("Enter the number of nickels: ");
        double numberOfNickels = read.nextDouble();

        System.out.println("Enter the number of dimes: ");
        double numberOfDimes = read.nextDouble();

        System.out.println("Enter the number of quarters: ");
        double numberOfQuarters = read.nextDouble();
        read.close();

        //Make decision
        double sumOneDollar = numberOfPennies*penny + numberOfNickels*nickel + numberOfDimes*dime + numberOfQuarters*quarter;

        if(sumOneDollar < dollar){
            double amountShort = dollar - sumOneDollar;
            System.out.println("Sorry, you lose! You were short of " + String.format("%.2f", amountShort) + " cents." );
        }
        else if(sumOneDollar > dollar){
            double amountOver = sumOneDollar - dollar;
            System.out.println("Sorry, you lose! You were over of " + String.format("%.2f", amountOver) + " cents.");
        }
        else {
            System.out.println("Congrats! You win!");
        }
    }
}
