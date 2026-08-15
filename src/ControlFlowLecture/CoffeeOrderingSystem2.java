package ControlFlowLecture;

import java.util.Scanner;

public class CoffeeOrderingSystem2 {
    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println("WELCOME TO  COFFEE CAFE \u2615");
        System.out.println("**********************************");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose your cofee :\n 1.Espresso - ₹200 \n 2.Cappuccino - ₹250 \n 3.Latte - ₹300");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
        double bill=0;
        bill=switch (choice) {
            case 1->
                bill = bill + 200;

            case 2->
                bill = bill + 250;

            case 3->
                bill = bill + 300;

            default->{
                System.out.println("Invalid choice! Please enter a valid coffee choice....");
                yield -1;
            }
        };
        if(bill>0) {
            System.out.println("Add whipped cream for ₹30 (yes=1/no=0): ");
            int whippedCreamChoice =sc.nextInt();
            if (whippedCreamChoice == 1) {
                bill += 30;
            }
            System.out.println("Add a flavor shot ?(Vanilla for ₹20 or Hazelnut for ₹25(yes=1/no=0): ");
            int flavor = sc.nextInt();
            if (flavor == 1) {
                int flavorChoice;
                do {
                    System.out.println("Which one?(Enter 1 for vanilla(₹20) & 2 for Hazelnut(₹25) :");
                    flavorChoice = sc.nextInt();
                bill=switch (flavorChoice) {
                    case 1->{
                    bill += 20;
                        yield bill;
                    }
                    case 2->{
                        bill += 25;
                        yield bill;
                    }

                    default -> {
                        System.out.println("Invalid choice");
                        yield bill;
                    }
                };
            }while (flavorChoice<1&&flavorChoice>1);
            }
            System.out.println("Total bill is: "+bill);
        }
        }while(choice<1||choice>3);
    }
}
