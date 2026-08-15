package ControlFlowLecture;

import java.util.Scanner;

public class WhileTop1 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        if (num<1){
            System.out.println("Invalid number!");
        }
        // Using brute force approach but time complexity is more for this
//        for(int i=1;i<num;i++){
//            if(num%i==0){
//                System.out.println(i);
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
        else {
            System.out.print("The proper divisors of "+num +" are: ");
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.print(i+" ");
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println("\n"+num + " is a perfect number");
            } else {
                System.out.println("\n"+num + " is not a perfect number");
            }
        }
    }
}
