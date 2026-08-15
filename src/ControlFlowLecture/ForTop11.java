package ControlFlowLecture;

import java.util.Scanner;

public class ForTop11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int count=0;
        int originalNumber=num;
        if (num==0){
            count+=1;
        }else {
            for (; num != 0; num /= 10) {
                int rem = num % 10;
                count++;
            }
        }
            System.out.println("The " + originalNumber + " has " + count + " digits");

    }
}
