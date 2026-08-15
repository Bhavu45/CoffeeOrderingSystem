package Practice;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a=10,b=20;
        int p=2,q=3;
        float x=36.67f,y=23.42f;
        int result=a+b - b++ + ++a - a++ * ++b;
        a+=10;
        x+=23;
        y-=50;
        System.out.println(result);
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(-a);
        System.out.println(p+-q);
        System.out.println(p>q?p:q);
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x*y);
        System.out.println(x%y);
    }
}
