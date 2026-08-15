package ControlFlowLecture;

import java.util.Scanner;

public class Assign4 {
        public static void main(String[] args) {
            int num;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number: ");
            num= sc.nextInt();
            if(num>0){
                System.out.println("It is positive");
            }
            else if(num<0){
                System.out.println("It is negative");
            }
            else{
                System.out.println("It is zero");
            }
        }
}
