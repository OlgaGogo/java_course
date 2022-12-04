package extra_practice;

import java.util.Scanner;

public class Equivalence {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        String firstPhrase = getFirstPhrase();
        String secondPhrase = getSecondPhrase();

        if(firstPhrase.equals(secondPhrase)){
            System.out.println("Your words are equal");
        }
        else{
            System.out.println("These are different words");
        }
    }

    public static String getFirstPhrase(){
        System.out.println("Enter the first word:");
        return scanner.next();
    }
    public static String getSecondPhrase(){
        System.out.println("Enter the second word:");
        return scanner.next();
    }
}
