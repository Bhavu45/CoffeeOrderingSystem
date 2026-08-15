package ControlFlowLecture;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
//        enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
//        Day day=Day.Sunday;
//        switch(day){
//            case Monday :
//                System.out.println("Weekday");
//                break;
//            default:
//                System.out.println("Invalid day choice!");
//            case Tuesday:
//                System.out.println("Weekday");
//                break;
//            case Wednesday:
//                System.out.println("Weekday");
//                break;
//            case Thursday:
//                System.out.println("Weekday");
//                break;
//            case Friday:
//                System.out.println("Weekday");
//                break;
//            case Saturday:
//                System.out.println("Weekend");
//                break;
//            case Sunday:
//                System.out.println("Weekend");
//                break;
        byte num;
////        final int a=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=scan.nextByte();
//        Integer wrapperIntType=Integer.valueOf(num);
        switch (num){//selector expression
            case 1: case 2: case 3: case 4: case 5: //we can use multiple cases in a single line
                System.out.println("Weekday");
                break;
            case 6: case 7:
                System.out.println("Weekend");
                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid choice");
        }
    }
}
