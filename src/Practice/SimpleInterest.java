package Practice;

import java.util.Scanner;

public class SimpleInterest {
        void display(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Principal amount :" );
            int principal=sc.nextInt();
            System.out.println("Enter the rate of the interest:");
            int rate=sc.nextInt();
            System.out.println("Enter the Number of years: ");
            int time=sc.nextInt();
            int result=(principal*rate*time)/100;
            System.out.println("Simple Interest is:"+result);
        }
        public static void main(String[] args){
            SimpleInterest si=new SimpleInterest();
            si.display();
        }

    }

