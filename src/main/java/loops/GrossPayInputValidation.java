package loops;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]){
        //Initialize known variables
        int rate = 15;
        int hoursMax = 40;

        //Get input for unknown variables
        System.out.println("Enter the number of hours worked for the week: ");
        Scanner read = new Scanner(System.in);
        double hoursWorked = read.nextDouble();

        //Validate input
        while (hoursWorked > hoursMax || hoursWorked < 1){
            System.out.println("Invalid input. Your hours must be between 1 and 40. Try again");
            hoursWorked = read.nextDouble();
        }
        read.close();

        double gross = hoursWorked * rate;
        System.out.println("Your gross salary is: " + gross);

    }
}
