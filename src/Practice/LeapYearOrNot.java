package Practice;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        int year;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the year :");
        year=s.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
}
