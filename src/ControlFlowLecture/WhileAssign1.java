package ControlFlowLecture;

import java.util.Scanner;

public class WhileAssign1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("*******MENU********");
            System.out.println("1. Calculate the sum of two numbers\n2. Find the factorial of a number\n3. Check whether a number is even or odd\n4. Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
//            if (choice>4||choice<1){
//                System.out.println("Invalid choice Please try again!....");
//            }
        switch (choice){
            case 1->{
                System.out.println("Enter the two numbers for addition: ");
                int a= sc.nextInt();
                int b= sc.nextInt();
                int sum=a+b;
                System.out.println("The sum of two numbers "+a+" and "+b+" is : "+sum);
            }
            case 2->{
                System.out.println("Enter the number: ");
                int num= sc.nextInt();
                int factorial=1;
                for(int i=num;i>=1;i--){
                    factorial*=i;
                }
                System.out.println("Factorial of "+num+" is : "+factorial);
            }
            case 3->{
                System.out.println("Enter the number: ");
                int num=sc.nextInt();
                if(num%2==0){
                    System.out.println(num+" is Even");
                }else {
                    System.out.println(num+" is Odd");
                }
            }
            case 4-> System.out.println("Exiting Menu!.......");
            default -> System.out.println("Invalid choice Please try again!");
        }
        }while(choice!=4);
    }
}
