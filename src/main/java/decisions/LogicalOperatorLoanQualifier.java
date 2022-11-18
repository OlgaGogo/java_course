package decisions;

/*
 * LOGICAL OPERATORS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String args[]){
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYears = 2;

        //Get what we don't
        System.out.println("Enter the salary");
        Scanner read = new Scanner(System.in);
        double currentSalary = read.nextDouble();

        System.out.println("Enter the number of years");
        double currentYears = read.nextDouble();
        read.close();

        //Make decision
        if(currentSalary >= requiredSalary && currentYears >= requiredYears){
            System.out.println("The loan is approved");
            }
        else {
            System.out.println("Sorry you must have salary of " + requiredSalary + " $ minimum");
        }

    }
}
