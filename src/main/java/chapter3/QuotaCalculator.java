package chapter3;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){
        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales of an employee for last week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take – Output
        if(sales >= 10){
            System.out.println("Congratulations! You got a $250 bonus");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("Sorry. You had to make only " + salesShort + " sales to get a $250 bonus.");

        }
    }
}
