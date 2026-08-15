package College;

public class WrapperClass {
    public static void main(String[] args) {
        int a=10;
        Integer obj=a;
        System.out.println("Autoboxed: "+obj);
        Integer b=20;
        int c=b;
        System.out.println("AutoUnboxed : "+c);
    }
}
