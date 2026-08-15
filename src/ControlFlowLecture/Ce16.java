package ControlFlowLecture;

import java.util.Scanner;
public class Ce16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a= scan.nextInt();
        System.out.println("Enter the second number: ");
        int b=scan.nextInt();
        System.out.println("Enter an operator(+,-,*,/,%): ");
        char c=scan.next().charAt(0);
        switch (c){
            case '+'-> System.out.println("Sum: "+(a+b));
            case '-'-> System.out.println("Difference: "+(a-b));
            case '*'-> System.out.println("Product: "+(a*b));
            case '/'-> System.out.println("Quotient: "+(a/b));
            case '%'-> System.out.println("Remainder: "+(a%b));
        }
    }
}
