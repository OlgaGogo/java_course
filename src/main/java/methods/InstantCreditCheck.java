package methods;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        //Get what we don't know
        double currentSalary = getSalary();
        int currentCreditScore = getCreditScore();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(currentSalary, currentCreditScore);

        //Notify the user
        notifyUser(qualified);

    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        int currentCreditScore = scanner.nextInt();
        return currentCreditScore;
    }
    public static boolean isUserQualified(double currentSalary, int currentCreditScore){
        if(currentSalary >= requiredSalary && currentCreditScore >= requiredCreditScore){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You're qualified");
        }
        else{
            System.out.println("Damn. You're a looser");
        }
    }
}
