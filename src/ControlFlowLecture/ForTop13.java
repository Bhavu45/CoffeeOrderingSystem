package ControlFlowLecture;

import java.util.Scanner;

public class ForTop13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scan.nextInt();
        System.out.println("Enter the power: ");
        int pow= scan.nextInt();
        int result=1;
        for (int i=1;i<=pow;i++){
            result=result*num;
        }
        System.out.println(num+ " to the power of "+pow+ " is equal to "+result);
    }
}
