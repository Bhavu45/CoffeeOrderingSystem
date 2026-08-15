package Practice;

import java.util.Scanner;

public class NumbersEquality {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        n1=sc.nextInt();
        System.out.println("Enter the second number:");
        n2= sc.nextInt();
        if((n1^n2)==0){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }
}
