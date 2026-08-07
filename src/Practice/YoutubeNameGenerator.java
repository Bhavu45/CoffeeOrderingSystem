package Practice;

import java.util.Scanner;

public class YoutubeNameGenerator {
    void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO YOUTUBE CHANNEL NAME GENERATOR!");
        System.out.println("What is your nick name :");
        String s1=sc.nextLine();
        System.out.println("What is the next word you want to add :");
        String s2=sc.nextLine();
        System.out.println("Your YT channel name could be:"+s1+" " +s2);
    }

    public static void main(String[] args) {
        YoutubeNameGenerator yng=new YoutubeNameGenerator();
        yng.display();
    }
}
