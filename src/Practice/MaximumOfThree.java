package Practice;

import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=scan.nextInt();
        System.out.println("Enter second number:");
        b=scan.nextInt();
        System.out.println("Enter third number:");
        c=scan.nextInt();
        int max=a>b ? (a>c?a:c): b>c?b:c;
        System.out.println(max);
    }
}


