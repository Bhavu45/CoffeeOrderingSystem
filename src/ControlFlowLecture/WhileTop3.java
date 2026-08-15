package ControlFlowLecture;

import java.util.Scanner;

public class WhileTop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        //Using gcd
        int gcd=1;
        int temp;
        int a=num1;
        int b=num2;
        while (num2!=0){
            temp=num2;
            num2=num1%num2;
            num1=temp;               //answer will be stored
        }
        System.out.println("The LCM of "+a+" and "+b+" is: "+((a*b)/num1));
        // Using Brute force approach
//        int max=num1>num2?num1:num2;
//        int lcm=max;
//        while (true){
//            if (lcm % num1==0 && lcm%num2==0 ){
//                break;
//            }
//            lcm+=max;
//        }
//        System.out.println("The LCM of "+num1+" and "+num2+" is: "+lcm);
    }
}
