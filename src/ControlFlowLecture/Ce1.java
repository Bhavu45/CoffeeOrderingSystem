package ControlFlowLecture;

import java.util.Scanner;

public class Ce1 {
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        n= scan.nextInt();
        if(n>0){
            System.out.println("Positive number!");
        }
    }
}
