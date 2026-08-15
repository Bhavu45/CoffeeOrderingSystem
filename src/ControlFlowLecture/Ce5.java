package ControlFlowLecture;
import java.util.Scanner;
public class Ce5 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number1 :");
        num1=scan.nextInt();
        System.out.println("Enter the number2 :");
        num2=scan.nextInt();
        if(num1>num2){
            System.out.println(num1 + " is maximum than "+num2);
        }
        else{
            System.out.println(num2 + " is maximum than "+num1);
        }
    }
}
