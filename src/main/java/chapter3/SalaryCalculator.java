package chapter3;

import java.util.Scanner;

/*
If statement.
All salespersons get a payment of $1000 a week.
The salesperson who exceed 10 sales gets an additional bonus of $250.
 */
public class SalaryCalculator {
    public static void main(String args[]){

        //Initialize the known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("Enter the number of sales the employee made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour foe the bonus earners
        if (sales > quota){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's salary is $" + salary);
    }
}
