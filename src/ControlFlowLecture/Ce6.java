package ControlFlowLecture;

import java.util.Scanner;

public class Ce6 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1: ");
        n1= sc.nextInt();
        System.out.println("Enter the number2: ");
        n2=sc.nextInt();
        System.out.println("Enter your choice : ");
        ch= sc.nextInt();
        if(ch==1){
            int result=n1+n2;
            System.out.println("Sum of two numbers is : "+result);
        }
        else{
            int res=n1-n2;
            System.out.println("Difference of two numbers is : "+res);
        }
    }
}
