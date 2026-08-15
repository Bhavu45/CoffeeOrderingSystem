package ControlFlowLecture;

import java.util.Scanner;

public class ForTop4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N=scan.nextInt();
        int sum=0;
        System.out.println("Enter the starting number: ");
        int start= scan.nextInt();
        for (int i=start;i<=N;i++){
            if (i%2==0){
                System.out.println(i);
                sum=sum+i;
            }
//            System.out.println(sum);
        }
        System.out.println("Sum: "+sum);
    }
}
