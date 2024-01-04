package piyushkatiyar;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();

        int targetNumber = random.nextInt(max - min + 1) + min;
        int maxAttempts = 5; // You can adjust the maximum number of attempts

        System.out.println("I have selected a number between " + min + " and " + max + ". Try to guess it!");

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Enter your guess (Attempt " + attempts + "): ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("The correct number was: " + targetNumber);
                System.out.println("Attempts taken: " + attempts);
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
            }
        }

        scanner.close();
    }
}
