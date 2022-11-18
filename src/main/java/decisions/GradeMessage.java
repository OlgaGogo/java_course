package decisions;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        System.out.println("Enter your grade:");
        Scanner read = new Scanner(System.in);
        String grade = read.nextLine();
        read.close();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Good job!";
                break;
            case "C":
                message = "Try again";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);

    }
}
