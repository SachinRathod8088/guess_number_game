import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(100) + 1;
        int guess, count = 0;
        boolean win = false;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        while (count < 5) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            count++;

            if (guess == num) {
                win = true;
                break;
            } else if (guess < num) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        if (win) {
            System.out.println("Congratulations! You guessed the number in " + count + " tries!");
        } else {
            System.out.println("Sorry, you ran out of tries. The number was " + num + ".");
        }
    }
}
