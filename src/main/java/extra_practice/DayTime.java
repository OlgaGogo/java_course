package extra_practice;

import java.util.Scanner;

public class DayTime {
    public static void main(String[] args) {
        String[] dayTime = {"Morning", "Afternoon", "Evening", "Night"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in a 24h format");
        int input = scanner.nextInt();
        scanner.close();

        if (input >= 6 && input <= 12) {
            System.out.println("This is " + dayTime[0]);
        } else if (input > 12 && input <= 18) {
            System.out.println("It is " + dayTime[1]);
        } else if (input > 18 && input <= 23) {
            System.out.println("It is " + dayTime[2]);
        } else {
            System.out.println("It is " + dayTime[3]);
        }
    }
}
