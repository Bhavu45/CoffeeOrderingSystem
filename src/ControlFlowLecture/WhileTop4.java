package ControlFlowLecture;

import java.util.Scanner;

public class WhileTop4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scanner.nextInt();
//        if(num==0){
//        System.out.println("Zero is divisor of all numbers");
//        }
//        Using brute force approach
//        int count=0;
//        for (int i=1;i<=num;i++){
//            if (num%i==0){
//                System.out.println(i);
//                count++;
//            }
//        }
//        System.out.println(count);
//        Using optimised approach
//        int count=1;
//        for (int i=1;i<=num/2;i++){
////            for (int i=1;i<=Math.abs(num)/2;i++){  for negative number
//            if (num%i==0){
//                System.out.println(i); // here for negative number print -i
//                count++;
//            }
//        }
//        System.out.println("Count: "+count);
//        Using more optimised approach
        int count=0;
        for (int i=1;i<=Math.sqrt(num);i++){
            if (num%i==0){
                if (i==num/i){            // bcoz we are doing in pairs like 1*12 and 12*1
                    count++;
                }else {
                    count+=2;
                }
//                System.out.println(i);
//                count++;
            }
        }
        System.out.println("Count:"+count);
    }
}
