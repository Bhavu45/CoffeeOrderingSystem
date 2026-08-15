package ControlFlowLecture;

import java.util.Scanner;

public class WhileAssign3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        System.out.println("Factors of "+num+" are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
