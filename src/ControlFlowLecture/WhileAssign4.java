package ControlFlowLecture;

import java.util.Scanner;

public class WhileAssign4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int product=1;
        for (;num!=0;num/=10){
            int rem=num%10;
            product*=rem;
        }
        System.out.println(product);
    }
}
