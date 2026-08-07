package Practice;

import java.util.Scanner;

public class DivisibleByTwoUsingBitwise {
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");                          //1010
        n= scan.nextInt();                                                 //0001
        if((n&1)==0){                                                      //1011
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
