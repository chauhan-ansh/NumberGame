package Task1;

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int score = 0;

        System.out.println("Welcome to the Number Game!");

        while (true){
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;

            System.out.println("Round " + (score + 1));
            System.out.println("I've selected a number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Try a higher number. Attempts left: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Try a lower number. Attempts left: " + (maxAttempts - attempts));
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You've run out of attempts. The correct number was " + secretNumber + ".");
            }

            System.out.print("Do you want to play another round? (Y/N): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("Y")) {
                System.out.println("ThankYou for Playing! Your total score is: " + score);
                break;
            }
        }
        scanner.close();
    }
}
