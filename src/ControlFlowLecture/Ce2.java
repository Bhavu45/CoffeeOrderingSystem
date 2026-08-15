package ControlFlowLecture;

import java.util.Scanner;

public class Ce2 {
    public static void main(String[] args) {
        int age;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the age of a person : ");
        age=scan.nextInt();
        if(age>65){
            System.out.println("Person is eligible to get Senior Citizen Discount!");
        }
        System.out.println("Outside if");
    }
}
