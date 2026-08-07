package Practice;

public class VariableDemo {
    int count=7;
    int x=86;
    double pi= 3.14;
    boolean isJavaFun=true;
    void display(){
        //int x=87;
        System.out.println("Value of count:"+count);
        System.out.println("Value of PI:"+pi);
        System.out.println("Value of x:"+x);
        System.out.println("IS JAVA FUN:"+isJavaFun);
    }

    public static void main(String[] args) {
        VariableDemo vd=new VariableDemo();
        int x=67;
        System.out.println("Value of x:"+x);
        vd.display();
    }
}
