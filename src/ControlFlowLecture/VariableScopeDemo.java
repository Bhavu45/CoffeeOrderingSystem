package ControlFlowLecture;

public class VariableScopeDemo {
    void display(){
        int a=9;                                                     //we can access inside this method only
        if (a==9){
            int b=10;                                                // here b can be accessed within this block
            System.out.println(b);
        }
        System.out.println(a);
//        System.out.println(b);                                        // hence its giving error bcoz it is out of block
    }

    public static void main(String[] args) {
        VariableScopeDemo obj=new VariableScopeDemo();
        obj.display();
    }
}
//    int a=10;                           // in all the methods we can access these variables and also throughout the class
//    int b=a;
//    void display(){
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//    public static void main(String[] args) {
//        VariableScopeDemo obj=new VariableScopeDemo();
//        obj.display();
//    }
//}
