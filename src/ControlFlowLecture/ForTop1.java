package ControlFlowLecture;

import java.util.Scanner;

public class ForTop1 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        if (n<=0){
            System.out.println("Invalid number");
        }else {
            for (int i = 1; i <= n; i++) {
                sum += i;
//            System.out.println(sum);
            }
            System.out.println("The sum of first "+n+" natural numbers is: "+sum);
        }
    }
}
