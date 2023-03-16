import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        
        System.out.println("Welcome to the guessing game!");
        
        while (win == false) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = input.nextInt();
            numberOfTries++;
            
            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            }
        }
        
        System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
    }
}
