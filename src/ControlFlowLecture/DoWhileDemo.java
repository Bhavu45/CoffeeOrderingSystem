package ControlFlowLecture;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter the number between 1 and 50: ");
            num= scan.nextInt();
            if (num<1||num>50) {
                System.out.println("Invalid number ! Please enter a valid number: ");
            }
        }while(num<1||num>50);
        System.out.println("Thank you!");
    }
}
