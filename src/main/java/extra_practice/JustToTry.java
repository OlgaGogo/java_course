package extra_practice;

import java.util.Scanner;

public class JustToTry {
    public static void main(String[] args) {
        bot();
    }

    public static void bot(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 or 2");
        int number = sc.nextInt();

        switch (number) {
            case 1 -> System.out.println("Order confirmed");
            case 2 -> System.out.println("info@sololearn.com");
            default -> System.out.println("Try again");
        }
    }
}
