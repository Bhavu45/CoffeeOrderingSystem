package ControlFlowLecture;

import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1= sc.nextInt();
        System.out.println("Enter the second number: ");
        num2=sc.nextInt();
        System.out.println("Enter the third number: ");
        num3=sc.nextInt();
        if(num1>num2 && num1>num3) {
            System.out.println("First number is maximum");
        }
        else if(num2>num1&&num2>num3){
            System.out.println("Second number is maximum");
        }
        else{
            System.out.println("Third number is maximum");
        }
    }
}
