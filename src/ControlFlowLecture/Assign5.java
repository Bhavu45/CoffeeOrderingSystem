package ControlFlowLecture;

import java.util.Scanner;

public class Assign5 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        num3 = sc.nextInt();
        if((num1>num2&&num1<num3)||(num1<num2&&num1>num3)) {
            System.out.println("Second largest is : "+num1);
        }
        else if((num2>num1&&num2<num3)||(num2<num1&&num2>num3)){
            System.out.println("Second largest is :"+num2);
        }
        else{
            System.out.println("Second Largest is :"+num3);
        }
    }
}
