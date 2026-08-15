package ControlFlowLecture;

import java.util.Scanner;

public class SwitchEnhancementDemo {
    static String dayOfweek(String day) {
        return switch (day) {
            default -> {
                System.out.println("You entered :"+day);
                yield "Invalid day";
            }
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
        };
    }

    public static void main(String[] args) {
        String result = dayOfweek("sunday");
        System.out.println(result);
    }
}
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number from 1 to 7: ");
//        int dayNumber= sc.nextInt();
//        String result=switch(dayNumber){           //it is complete like int a=5; statement
//            case 1,2,3,4,5-> "WeekDay";
//            case 6,7-> "Weekend";
//            default -> "Invalid day number";
//        };
//        System.out.println("it is"+result);
//        switch (dayNumber){
//            case 1,2,3,4,5-> {                                                                 //case label->an expression or block of code
//                int a = 10;
//                System.out.println("Weekday");
//                System.out.println("Its time to work");
//            }
//            case 6,7->
//                System.out.println("Weekend");
//            default->
//                System.out.println("Invalid day number");
//        }
//    }
//}
