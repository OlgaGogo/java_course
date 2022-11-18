package methods;

/*
So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
 */

import java.util.Scanner;

public class CellPhoneBill {
    static double overageMinuteCost = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        //Get what we don't know
        double planFee = getPlanFee();
        double overageMinutes = getOverallMinutes();
        scanner.close();

        //Calculate cost of overage minutes
        double minutesSubtotal = overageMinuteSubtotal(overageMinutes);

        //Calculate tax
        double taxSubtotal = taxSubtotal(planFee, tax, minutesSubtotal);

        //Calculate total
        double total = finalTotal(minutesSubtotal, taxSubtotal, planFee);

        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + minutesSubtotal);
        System.out.println("Tax: $" + taxSubtotal);
        System.out.println("Total: $" + total);
    }

    public static double getPlanFee(){
        System.out.println("Enter base cost of the plan:");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static double getOverallMinutes(){
        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes;
    }

    public static double overageMinuteSubtotal(double overageMinutes){
        double overageCharge = overageMinutes*overageMinuteCost;
        return overageCharge;
    }

    public static double taxSubtotal(double planFee, double tax, double minutesSubtotal){
        double taxSubtotal = (planFee + minutesSubtotal)*tax;
        return taxSubtotal;
    }

    public static double finalTotal(double minutesSubtotal, double taxSubtotal, double planFee){
        double total = minutesSubtotal + taxSubtotal + planFee;
        return total;
    }
}
