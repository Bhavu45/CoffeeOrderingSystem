package Practice;

import java.util.Scanner;

public class EqualityOfNumbers {
    public static void main(String[] args) {
        int n1,n2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        n1=scan.nextInt();
        System.out.println("Enter the number2 : ");
        n2=scan.nextInt();
        if((n1-n2)==0){
            System.out.println("Two numbers are equal");
    }
        else{
            System.out.println("Two numbers are not equal");
        }
    }
}
