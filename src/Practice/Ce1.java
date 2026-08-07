package Practice;

import java.util.Scanner;

public class Ce1 {
    public static void main(String[] args) {
        int age;
       boolean isCountry;
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age :");
        age=scan.nextInt();
        System.out.println("Are you Indian (true or false) :");
        isCountry=scan.nextBoolean();
        if(age>=18 && isCountry){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
