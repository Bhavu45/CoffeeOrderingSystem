package ControlFlowLecture;

import java.util.Scanner;

public class Ce3 {
    public static void main(String[] args) {
        int num;
        Scanner scc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        num=scc.nextInt();
        if(num==0){
            System.out.println("Number is zero!");
        }
        if(num%2==0){
            System.out.println("Number is Even!");
        }
        if(num>0){
            System.out.println("Number is positive");
        }
        System.out.println("Outside if");
    }
}
