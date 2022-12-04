package extra_practice;

import java.util.Scanner;

// This code will verify if the seat in the movie theater is sold or available

public class MovieTheater {

        public static void main(String[] args) {
            int[][] seats = {
                    {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                    {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                    {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                    {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
            };
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the row:");
            int row = sc.nextInt();
            System.out.println("Enter the seat:");
            int column = sc.nextInt();
            sc.close();

            if(seats[row][column] == 0){
                System.out.println("Free");
            }
            else {
                System.out.println("Sold");
            }
        }
    }
