import java.util.Random;
import java.util.Scanner;

public class Numberguessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int targetNumber = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            int guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Guess must be between 1 and 100.");
                continue;
            }

            if (guess == targetNumber) {
                hasWon = true;
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        if (hasWon) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempt(s).");
        } else {
            System.out.println("Sorry, you've run out of attempts. The number was " + targetNumber + ".");
        }
    }
}
