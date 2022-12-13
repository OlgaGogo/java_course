package arrays;

import java.util.Scanner;

/**
 * Make an array that holds its actual values of the days of the week, and then have the user input a number
 * corresponding to some day of the week.
 * And assume that the week starts on Monday.
 * Your program should output the String that represents the day of the week
 * that corresponds to the number that the user input. For example, if the user inputs the number 1,
 * your program should print “Monday”.
 */

public class DayofTheWeek {
    public static void main(String args[]){
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1 to 7");
        int index = scanner.nextInt();
        scanner.close();

        if(index<=7&&index>=1){
            System.out.println("The day of the week is: " + week[index - 1]);
        }
        System.out.println("You entered the wrong number. Enter correct number");

    }
}
