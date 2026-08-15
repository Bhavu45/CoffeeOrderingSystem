package College;

public class OverloadTest {
    int add(int a,int b){
        System.out.println("Add two integers");
        return a+b;
    }
    double add(double a,double b){
        System.out.println("Add two double");
        return a+b;
    }
    String add(String a,String b){
        System.out.println("Two strings");
        return a+b;
    }

    public static void main(String[] args) {
        OverloadTest olt=new OverloadTest();
        System.out.println(olt.add(6,7));
        System.out.println(olt.add(10.7,4.8));
        System.out.println(olt.add("Hello ","World"));
    }
}
