package Practice;

import java.util.Scanner;

public class TriangleArea {

        void display(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the base of the triangle:" );
            int base=sc.nextInt();
            System.out.println("Enter the height of the triangle:");
            int height=sc.nextInt();
            double result=0.5*base*height;
            System.out.println("Area of triangle is:"+result);
        }
        public static void main(String[] args){
            TriangleArea ta=new TriangleArea();
            ta.display();
        }

    }


