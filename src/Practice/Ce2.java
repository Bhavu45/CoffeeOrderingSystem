package Practice;

import java.util.Scanner;

public class Ce2 {
    public static void main(String[] args) {
        int age;
        boolean hasTicket;
        boolean hasInvitedByVIP;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age :");
        age=sc.nextInt();
        System.out.println("Do you have ticket(true or false) :");
        hasTicket=sc.nextBoolean();
        System.out.println("Do you have invited by VIP (true or false) :");
        hasInvitedByVIP=sc.nextBoolean();
        if(age>=18 && (hasTicket||hasInvitedByVIP)){
            System.out.println("You can enter into the concert");
        }
        else{
            System.out.println("Sorry you are not eligible");
        }
    }
}
