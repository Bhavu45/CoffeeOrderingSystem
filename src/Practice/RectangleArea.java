package Practice;

import java.util.Scanner;
    public class RectangleArea{
        void display(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the length of the rectangle:" );
            int length=sc.nextInt();
            System.out.println("Enter the breadth of the rectangle:");
            int breadth=sc.nextInt();
            int result=length*breadth;
            System.out.println("Area of Retangle is:"+result);
        }
        public static void main(String[] args){
            RectangleArea ra=new RectangleArea();
            ra.display();
        }

    }


