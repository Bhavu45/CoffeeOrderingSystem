package ControlFlowLecture;

import java.util.Scanner;

public class PasswordChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final String originalPassword="Bhavyan@123";
        String enteredPassword;
        do{
            System.out.println("Enter the password: ");
            enteredPassword=sc.nextLine();
            if (!(originalPassword.equals(enteredPassword))){
                System.out.println("Invalid ! Try Again....");
            }
        }while(!(originalPassword.equals(enteredPassword)));
        System.out.println("Thank you! Access Granted");
    }
}
