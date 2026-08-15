package ControlFlowLecture;

import java.util.Scanner;

public class ForTop9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int t1 = 0, t2 = 1;
        if (n<1){
            System.out.println("Invalid choice");
        } else if (n==1) {
            System.out.print("The Fibonacci series is:  "+t1);
        } else {
            System.out.print("The Fibonacci series is: " + t1 + " " + t2);
            for (int i = 3; i <= n; i++) {                                                      // here i represents the term why i=3 bcoz 1st and 2nd term are fix hence we ae starting from 3rd term
                int nextTerm = t1 + t2;
                System.out.print(" " + nextTerm);
                t1 = t2;
                t2 = nextTerm;
            }
        }
    }
}
