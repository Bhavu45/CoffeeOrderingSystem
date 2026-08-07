package College;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int result=num;
        int reverse=0;
        while(num>0){
            int d=num%10;
            reverse=reverse*10+d;
            num=num/10;
        }
        if(reverse==result){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
    }
}
