package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab110_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        //Random => 1 to 100

        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");

        int guess;
        int attempts = 0;

        while (true){
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess){
                System.out.println("Too low,try again!");
            }
            else if(guess > numberToGuess){
                System.out.println("Too high, try again!");

            }else {
                System.out.println("Correct! You guess it: "+ attempts +" attempts ");
                break;

            }
        }
    }
}
// Note : enter the number until it says correct in console