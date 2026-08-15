package ControlFlowLecture;

import java.util.Scanner;

public class WhileAssign7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int result=(num|1);
        System.out.println(result);
    }
}
