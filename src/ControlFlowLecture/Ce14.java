package ControlFlowLecture;
import java.util.Scanner;
public class Ce14 {
    static String trafficColor(String lightcolor){
        return switch (lightcolor){
            case "Red"->"Stop";
            case "Yellow"->"Ready";
            case "Green"->"Go";
            default -> "Invalid choice";
        };
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the color: ");
        String color= sc.nextLine();
//        String symbol=trafficColor(color);
        System.out.println("The traffic color is "+color+" and it says "+trafficColor(color));
    }
}

