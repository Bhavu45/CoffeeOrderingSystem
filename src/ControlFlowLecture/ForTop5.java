package ControlFlowLecture;

import java.util.Scanner;

public class ForTop5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N= sc.nextInt();
        boolean isPrime=true;
        // brute fore approach it requires more time in worst case for example if i have to check 1013 is primr or not it checks from 2 to 1012 so it is not so optimized
//            for (int i=2;i<N;i++) {
//                if (N % i == 0) {
//                    System.out.println(N+" is not prime");
//                    isPrime=false;
//                    break;
//                }
//            }
//            if (isPrime==true){
//                System.out.println(N+" is prime");
//            }
            // using N/2 suppose if i choose 10 10/2 is 5 so i just need to check for 2,3,4,5
//        for (int i=2;i<N/2;i++) {
//            if (N % i == 0) {
//                System.out.println(N+" is not prime");
//                isPrime=false;
//                break;
//            }
//        }
//        if (isPrime==true){
//            System.out.println(N+" is prime");
//        }
        //using square root is one of the most optimized because iteration is done till the square root of that number hence time complexity is less
        for (int i=2;i<=Math.sqrt(N);i++) {
            if (N % i == 0) {
                System.out.println(N+" is not prime");
                isPrime=false;
                break;
            }
        }
        if (isPrime==true){
            System.out.println(N+" is prime");
        }
        sc.close();
        }
    }

