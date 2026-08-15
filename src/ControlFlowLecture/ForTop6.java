package ControlFlowLecture;

import java.util.Scanner;

public class ForTop6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int original=num;
        int rev=0;
        for (;num!=0;num/=10){
            int rem=num%10;
            rev=rev*10+rem;
            if (original==rev){
                System.out.println ("Palindrome");
            }
        }
            System.out.println("Not Palindrome");
    }
}
