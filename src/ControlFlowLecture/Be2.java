package ControlFlowLecture;

import java.util.Scanner;

public class Be2 {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid choice!");
        } else {
            String grade=switch (marks / 10) {
                case 9, 10-> "A";
                case 8-> "B";
                case 7-> "C";
                case 6-> "D";
                default-> "F";
            };
            System.out.println("You got "+grade);
        }
    }
}
