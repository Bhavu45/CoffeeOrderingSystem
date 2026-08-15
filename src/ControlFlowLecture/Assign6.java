package ControlFlowLecture;

import java.util.Scanner;

public class Assign6 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        if(num%5==0&&num%13==0){
            System.out.println("It is Divisible by both 5 and 13");
        }
        else{
            System.out.println("It is not divisible by both 5 and 13");
        }
    }
}
