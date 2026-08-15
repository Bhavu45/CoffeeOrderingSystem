package ControlFlowLecture;

import java.util.Scanner;

public class ForCe2 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = scan.nextInt();
        for (int num = 2;num%2==0 && num <= 20;num++) {
          System.out.println(num);
          num++;
//            if (num % 2 == 0) {
//                System.out.println(num);
            }
        }
    }

