package ControlFlowLecture;

import java.util.Scanner;

public class Cq2 {
    static String drink(String drink) {
        return switch (drink) {
            case "Coffee" -> "Rs.50";
            case "Tea" -> "Rs.30";
            case "Juice" -> "Rs.70";
            case "Water" -> "Rs.20";
            default -> "Invalid input";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the drink: ");
        String drink = sc.nextLine();
        String result = drink(drink);
        System.out.println("Result: " + result);
    }
}
