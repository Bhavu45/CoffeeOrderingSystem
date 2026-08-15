package ControlFlowLecture;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        boolean playAgain = true;
        while (playAgain) {
            // generate a random number from 1 to 100
            Random rm = new Random();
            int secret_number = rm.nextInt(100) + 1;                         // here plus 1 is because if i dont give that it only takes number from 0 to 99 hence plus 1 makes 0+1=1 and 99+1=100
            System.out.println("--------------------------------\nWELCOME! TO NUMBER GUESSING GAME\n-------------------------------- ");
            System.out.println("Hello ! Please guess the number in the range of 1 to 100");
            int guessed_number;
            System.out.println("Enter your choice: \n1.Easy\n2.Medium\n3.Hard");
            int choice = sc.nextInt();
            int max = switch (choice) {
                case 1 -> 10;
                case 2 -> 7;
                case 3 -> 5;
                default -> {
                    System.out.println("Invalid choice");
                    yield -1;
                }
            };
            for (; max >= 1; ) {
                System.out.println("Enter the number: ");
                guessed_number = sc.nextInt();
                if (guessed_number < 1 || guessed_number > 100) {
                    System.out.println("Invalid number! Please enter the number in the range of 1 to 100");
                    continue;
                } else if (guessed_number == secret_number) {
                    System.out.println("Correct!");
                    System.out.println("You won the game!");
                    break;
                } else if (guessed_number > secret_number) {
                    System.out.println("Too High!");
                } else if (guessed_number < secret_number) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("You lose the game!");
                }
                max--;
                if (max == 0) {
                    System.out.println("All your attempts have been reached and the correct number was: " + secret_number);
                    System.out.println("You lose the game!");
                    break;
                }
                System.out.println(" You have " + max + " attempts left!");
            }
            System.out.println("Do you want to play again?(yes/no): ");
            ch = sc.next();
            if (!ch.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }
    }
}
