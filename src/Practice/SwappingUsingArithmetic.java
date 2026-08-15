package Practice;

import java.util.Scanner;

public class SwappingUsingArithmetic {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        a+=b;
        b=a-b;
        a-=b;
        System.out.println("a ="+a);
        System.out.println("b =" +b);
    }
}
