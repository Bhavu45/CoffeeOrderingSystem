package ControlFlowLecture;

import java.util.Scanner;

public class Ce9 {
    public static void main(String[] args) {
        int a,b;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        a=sc.nextInt();
        System.out.println("Enter the second number: ");
        b=sc.nextInt();
        System.out.println("Enter only the numbers from 1 to 5 !");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        if (choice == 1) {
            int sum = a + b;
            System.out.println("Sum : " + sum);
        }
        else if (choice == 2) {
            int diff=a-b;
            System.out.println("Difference: "+diff );
        }
        else if(choice==3){
            int mul=a*b;
            System.out.println("Product: "+mul);
        }
        else if(choice==4){
            int div=a/b;
            System.out.println("Division: "+div);
        }
        else if(choice==5){
            int mod=a%b;
            System.out.println("Modulus :"+mod);
        }
        else {
            System.out.println("Invalid! please enter the number within the range of 1 to 5");
        }
    }
}
