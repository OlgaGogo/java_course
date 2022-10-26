package chapter4;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class LetterSearch {
    public static void main(String args[]){

        //Get text
        System.out.println("Enter some text:");
        Scanner read = new Scanner(System.in);
        String text = read.next();
        read.close();

        boolean letterFound = false;

        //Search for letter A
        for (int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("The text contains the letter A");
        }
        else {
            System.out.println("There is no A letter in the text");
        }
    }
}
