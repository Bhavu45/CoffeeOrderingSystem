package ControlFlowLecture;

import java.util.Scanner;

public class ForTop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;
        for (; num != 0; num /= 10) {
            int rem = num % 10;
            rev = rev * 10 + rem;
        }
        System.out.println("The reversed number is: "+rev);
    }
}
