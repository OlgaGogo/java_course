package chapterOLGA;
/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */

public class TaxCalculator {
    public static void main(String[] args){
        System.out.println("Your tax is " + getTax(1));
    }

    public static int getTax(int tax){
        switch (tax){
            case 1: return 10;
            case 2: return 20;
            case 3: return 30;
            default: return 0;
        }

    }


}
