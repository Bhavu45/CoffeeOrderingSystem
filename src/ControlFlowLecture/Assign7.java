package ControlFlowLecture;

import java.util.Scanner;

public class Assign7 {
    public static void main(String[] args) {
        int a, b;
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter only an operator (+, -, *, /) !");
        System.out.println("Enter your choice: ");
        choice = sc.next().charAt(0);
        if (choice == '+') {
            int sum = a + b;
            System.out.println("Sum : " + sum);
        } else if (choice == '-') {
            int diff = a - b;
            System.out.println("Difference: " + diff);
        } else if (choice == '*') {
            int mul = a * b;
            System.out.println("Product: " + mul);
        } else if (choice == '/') {
            int div = a / b;
            System.out.println("Division: " + div);
        } else if (choice == '%') {
            int mod = a % b;
            System.out.println("Modulus :" + mod);
        } else {
            System.out.println("Invalid! please enter an operator (+, -, *, /) ");
        }
    }
}
