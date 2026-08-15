package ControlFlowLecture;
import java.util.Scanner;
public class Assign2 {
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character (only Alphabets): ");
        ch=sc.next().charAt(0);
        if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
            System.out.println("Vowel!");
        }
        else {
            System.out.println("Consonant!");
        }
    }
}
