package Practice;

import java.util.Scanner;

public class Values {
        void display(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter byte value :" );
            byte num1=sc.nextByte();
            System.out.println("Enter short value:");
            short num2=sc.nextShort();
            System.out.println("Enter int  value:");
            int num3=sc.nextInt();
            System.out.println("Enter long value:");
            long num4=sc.nextLong();
            System.out.println("Enter float value:");
            float num5=sc.nextFloat();
            System.out.println("Enter double value:");
            double num6=sc.nextDouble();
            System.out.println("Enter boolean value:");
            boolean num7=sc.nextBoolean();
        }
        public static void main(String[] args){
            Values V=new Values();
            V.display();
        }

    }
