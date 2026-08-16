package ControlFlowLecture;

import java.util.Scanner;

public class CoffeeOrderingSystem {
    public static void main(String[] args) {
        int Espresso = 200, Cappuccino = 250, Latte = 300;
        int choice;
        int ch1, ch2, ch3;
        Scanner sc = new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("WELCOME TO  COFFEE CAFE \u2615");
        System.out.println("**********************************");
        System.out.println("Choose your cofee :\n 1.Espresso - ₹200 \n 2.Cappuccino - ₹250 \n 3.Latte - ₹300");
        choice = sc.nextInt();
        if (choice == 1 || choice == 2 || choice == 3) {
            int a = 30;
            int b = 20;
            int c = 25;
            System.out.println("Add whipped cream for ₹30 (yes=1/no=0): ");
            ch1 = sc.nextInt();
            System.out.println("Add a flavor shot ?(Vanilla for ₹20 or Hazelnut for ₹25(yes=1/no=0): ");
            ch2 = sc.nextInt();
            if (ch2 == 0) {
                if (choice == 1 && ch1 == 1) {
                    int res1 = Espresso + a;
                    System.out.println("Total Bill: " + res1);
                } else if (choice == 1 && ch1 == 0) {
                    int res2 = Espresso;
                    System.out.println("Total Bill: " + res2);
                } else if (choice == 2 && ch1 == 1) {
                    int res3 = Cappuccino + a;
                    System.out.println("Total Bill: " + res3);
                } else if (choice == 2 && ch1 == 0) {
                    int res4 = Cappuccino;
                    System.out.println("Total Bill: " + res4);
                } else if (choice == 3 && ch1 == 1) {
                    int res5 = Latte + a;
                    System.out.println("Total Bill: " + res5);
                } else if (choice == 3 && ch1 == 0) {
                    int res6 = Latte;
                    System.out.println("Total Bill: " + res6);
                }
            }
            if (ch2 == 1) {
                System.out.println("Which one?(Enter 1 for vanilla(₹20) & 2 for Hazelnut(₹25) :");
                ch3 = sc.nextInt();
                    if (choice == 1 && ch1 == 1 && ch3 == 1) {
                        int t1 = Espresso + a + b;
                        System.out.println("Total Bill: " + t1);
                    } else if (choice == 1 && ch1 == 0 && ch3 == 1) {
                        int t2 = Espresso + b;
                        System.out.println("Total Bill: " + t2);
                    } else if (choice == 1 && ch1 == 0 && ch3 == 2) {
                        int t3 = Espresso + c;
                        System.out.println("Total Bill: " + t3);
                    } else if ((choice == 1 && ch1 == 1 && ch3 == 2)) {
                        int t4 = Espresso + a + c;
                        System.out.println("Total Bill:" + t4);
                    } else if ((choice == 2 && ch1 == 1 && ch3 == 1)) {
                        int t5 = Cappuccino + a + b;
                        System.out.println("Total Bill: " + t5);
                    } else if (choice == 2 && ch1 == 0 && ch3 == 1) {
                        int t6 = Cappuccino + b;
                        System.out.println("Total Bill: " + t6);
                    } else if (choice == 2 && ch1 == 0 && ch3 == 2) {
                        int t7 = Cappuccino + c;
                        System.out.println("Total Bill: " + t7);
                    } else if ((choice == 2 && ch1 == 1 && ch3 == 2)) {
                        int t8 = Cappuccino + a + c;
                        System.out.println("Total Bill:" + t8);
                    } else if ((choice == 3 && ch1 == 1 && ch3 == 1)) {
                        int t9 = Latte + a + b;
                        System.out.println("Total Bill: " + t9);
                    } else if (choice == 3 && ch1 == 0 && ch3 == 1) {
                        int t10 = Latte + b;
                        System.out.println("Total Bill: " + t10);
                    } else if (choice == 3 && ch1 == 0 && ch3 == 2) {
                        int t11 = Latte + c;
                        System.out.println("Total Bill: " + t11);
                    } else if ((choice == 3 && ch1 == 1 && ch3 == 2)) {
                        int t12 = Latte + a + c;
                        System.out.println("Total Bill:" + t12);
                    }
            }
        }
        else {
            System.out.println("Invalid choice!");
        }
    }
}





