package ControlFlowLecture;

public class ElseIfDemo {
    public static void main(String[] args) {
        int temperature=56;
        if(temperature>=45){
            System.out.println("Red  Alert!");
        }else if(temperature>40){
            System.out.println("Orange Alert");
        }
        else if(temperature>35){
            System.out.println("You can go outside");
        }
        System.out.println("Outside If");
    }
}
