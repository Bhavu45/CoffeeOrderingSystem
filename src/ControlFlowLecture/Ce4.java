package ControlFlowLecture;

import java.util.Scanner;

public class Ce4 {
    public static void main(String[] args) {
        int num;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number : ");
        num=scan.nextInt();
        if(num>=0){
            System.out.println("Number is positive!");
        }
        else{
            System.out.println("Number is Negative!");
        }
    }
}
