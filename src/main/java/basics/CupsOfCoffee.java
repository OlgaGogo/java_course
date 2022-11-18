package basics;

import java.util.Scanner;

public class CupsOfCoffee {

    public static void main (String arg[]){

        // 1. Get the adjective
        System.out.println("Enter the adjective");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        // 2. Get the season of the year
        System.out.println("Enter the season of the year");
        String season = scanner.next();

        // 3. Get the number of coffee cups
        System.out.println("Enter the number of coffee cups");
        int cups = scanner.nextInt();

        // 4. Display the results
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + cups + " cups of coffee!");

    }
}
