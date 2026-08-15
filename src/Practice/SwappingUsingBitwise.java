package Practice;

import java.util.Scanner;

public class SwappingUsingBitwise {
    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a=s.nextInt();
        System.out.println("Enter the value of b : ");
        b=s.nextInt();
        a^=b;
        b=a^b;
        a^=b;
        System.out.println("a ="+a);
        System.out.println("b="+b);
    }
}
