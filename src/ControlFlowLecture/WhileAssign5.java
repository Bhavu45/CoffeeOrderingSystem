package ControlFlowLecture;

import java.util.Scanner;

public class WhileAssign5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        do {
            System.out.println("Enter the number: ");
            int num=scanner.nextInt();
            sum+=num;
            System.out.println("Sum: "+sum);
        }while (!(sum>100));
        System.out.println("Sum exceeded 100");
    }
}
