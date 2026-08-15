package ControlFlowLecture;

public class IfDemo {
    public static void main(String[] args) {
        int temperature=38;
//        if(temperature) here always value is required it cant be converted from int to boolean
//        if(temperature>40);{ we wont get any error but if stataement will be terminated here itself and sequential execution of program wil be done
          if(temperature>40){
            System.out.println("Heatwave Alert!");
        }else{
              System.out.println("You can go outside");
          }
        System.out.println("Outside If");
    }
}
