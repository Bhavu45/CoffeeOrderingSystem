package College;

public class Swap {
    public static void main(String[] args) {
         int a=5,b=6;
        System.out.println("Before Swapping : "+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping:"+a+" "+b);
    }
}
