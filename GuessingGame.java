package code;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int numberOfGuesses = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

        scanner.close();
    }
}

