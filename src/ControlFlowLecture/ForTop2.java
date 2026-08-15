package ControlFlowLecture;

import java.util.Scanner;

public class ForTop2 {
    public static void main(String[] args) {
        int factorial=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= scan.nextInt();
        if (n<0){
            System.out.println("Invalid number");
        }else {
            for (int i = n; i >= 1; i--) {
                factorial *= i;
            }
            System.out.println("The factorial of " +n+ " is: " +factorial);
        }
    }
}
