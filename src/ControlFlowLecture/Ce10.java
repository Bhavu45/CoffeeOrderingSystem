package ControlFlowLecture;

import java.util.Scanner;

public class Ce10 {
    public static void main(String[] args) {
        int age;
        boolean isCitizenship;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        age=sc.nextInt();
        if(age>=18) {
            System.out.println("Are you a citizen of India(true or false)");
            isCitizenship = sc.nextBoolean();

            if (isCitizenship) {
                System.out.println("You can Vote");
            } else {
                System.out.println("You have to be citizen of India");
            }
        }
        else{
                System.out.println("You are not Eligible to vote");
            }


    }
}
