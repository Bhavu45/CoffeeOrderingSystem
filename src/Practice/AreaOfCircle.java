package Practice;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double r;
        double pi=3.14;
        System.out.println("Enter the radius:");
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
        double area=pi*r*r;
        System.out.println("Area of Circle: "+area);
        double circumference=2*pi*r;
        System.out.println("Circumference of circle:"+circumference);
    }
}
