package ControlFlowLecture;

import java.util.Scanner;

public class DoWhileCe1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter your choice:  \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Modulus \n 6.Exit");
            num=scan.nextInt();
//            if (num<1||num>6){
//                System.out.println("Invalid choice ! Please enter your choice between 1 and 6");
//            }
            switch (num){
                case 1->{
                    System.out.println("Enter two numbers for addition: ");
                    int a= scan.nextInt();
                    int b= scan.nextInt();
                    int res=a+b;
                    System.out.println("Sum: "+res);
                }
                case 2->{
                    System.out.println("Enter two numbers for subtraction: ");
                    int a= scan.nextInt();
                    int b= scan.nextInt();
                    int res=a-b;
                    System.out.println("Difference: "+res);
                }
                case 3->{
                    System.out.println("Enter two numbers for multiplication: ");
                    int a= scan.nextInt();
                    int b= scan.nextInt();
                    int res=a*b;
                    System.out.println("Product: "+res);
                }
                case 4->{
                    System.out.println("Enter two numbers for Division: ");
                    int a= scan.nextInt();
                    int b= scan.nextInt();
                    if (b==0){
                        System.out.println("Division by zero is not defined");
                    }else {
                        int res = a / b;
                        System.out.println("Quotient: " + res);
                    }
                }
                case 5->{
                    System.out.println("Enter two numbers for Modulus: ");
                    int a= scan.nextInt();
                    int b= scan.nextInt();
                    if (b==0){
                        System.out.println("Division by zero is not defined");
                    }else {
                        int res = a % b;
                        System.out.println("Remainder: " + res);
                    }
                }
                default -> System.out.println("Invalid choice ! Please enter your choice between 1 and 6");
            }
        }while (num!=6);
        System.out.println("Thank you!");
    }
}
