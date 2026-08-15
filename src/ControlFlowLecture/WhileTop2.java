package ControlFlowLecture;

import java.util.Scanner;

public class WhileTop2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int temp;
        System.out.println("Enter the first number: ");
        int num1= scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2= scanner.nextInt();
        int a=num1;
        int b=num2;
        // using brute force approach
//        int gcd=1;
//        int min=num1<num2?num1:num2;
//        for (int i=min;i>=1;i--){
//            if (num1%i==0&&num2%i==0){
//                gcd=i;
//                break;
//            }
//        }
//        System.out.println("The GCD of "+num1+" and "+num2+" is: "+gcd);
//       Using Euclidean algorithm
        while (num2!=0){
            temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.println("The GCD of "+a+" and "+b+" is: "+num1);
    }
}
