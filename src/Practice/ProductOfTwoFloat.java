package Practice;

import java.util.Scanner;

public class ProductOfTwoFloat {
        void display(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter num1 :" );
            float num1=sc.nextFloat();
            System.out.println("Enter num2:");
            float num2=sc.nextFloat();
            float result=num1*num2;
            System.out.println("Product of two :"+result);
        }
        public static void main(String[] args){
            ProductOfTwoFloat PF=new ProductOfTwoFloat();
            PF.display();
        }

    }

