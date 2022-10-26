package chapter4;

import java.util.Random;

public class RollGame {
    public static void main(String args[]) {

        //Initialize what you know
        int rolls = 5;
        int currentSpace = 0;
        int maxSpaces = 20;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        //Repeat 5 attempts
        for (int i = 1; i<=rolls; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            System.out.printf("Roll #%d: You have rolled a %d%n", i, die);

            if(currentSpace == maxSpaces){
                System.out.println("You are on space " + currentSpace + ". Congrats, you win!");
                break;
            }
            else if(currentSpace > maxSpaces){
                System.out.println("Unfortunately that takes you past " + currentSpace + ". You lose!");
            }
            else if(i == rolls){
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        maxSpaces + " spaces. You lose!");
            }
            else {
                int spacesToGo = maxSpaces - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();

        }

    }
}
