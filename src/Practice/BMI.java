package Practice;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        double weight;
        double height;
        System.out.println("Enter the weight :");
        Scanner sc=new Scanner(System.in);
        weight=sc.nextDouble();
        System.out.println("Enter the height :");
        height= sc.nextDouble();
        height*=0.3048;//coversion of meter into feet
        double BMI=weight/(height*height);
        System.out.println("BMI :"+BMI);
    }
}
