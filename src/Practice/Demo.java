package Practice;

public class Demo{
    byte x=45;
    short y=12345;
    int sum=(short)x+y;
    int a=4567;
    int b=100;
    long c=200L;
    long sum1= (int)b+c;
    public static void main(String[] args){
        Demo d=new Demo();
        System.out.println(d.sum);
        System.out.println(d.a);
        System.out.println(d.sum1);
    }
}
