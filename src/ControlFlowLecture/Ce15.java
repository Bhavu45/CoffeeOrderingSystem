package ControlFlowLecture;

import java.util.Scanner;

public class Ce15 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scan.nextInt();
        switch(num%2){
            case 0-> System.out.println("Even");
            case 1-> System.out.println("Odd");
        }
    }
}
