package Practice;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        n=sc.nextInt();
        if((n&(n-1))==0){
            System.out.println("The number is power of 2 ");
        }
        else{
            System.out.println("The number is not power of 2");
        }
    }
}
