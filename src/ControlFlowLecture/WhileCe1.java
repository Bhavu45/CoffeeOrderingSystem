package ControlFlowLecture;

import java.util.Scanner;

public class WhileCe1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = scan.nextInt();
        while (true) {
            System.out.print("Enter the number between 1 to 50: ");
            int num = scan.nextInt();
            if (num >= 1 && num <= 50) {
                System.out.println("Thank you");
                break;
            } else {
                System.out.println("Invalid number ! Please enter a valid number");
            }
        }
    }
}
