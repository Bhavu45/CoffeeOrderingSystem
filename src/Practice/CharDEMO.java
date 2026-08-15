package Practice;

public class CharDEMO {
    //char minValue=Character.MAX_VALUE;
    //char maxValue=Character.MIN_VALUE;
    //int a=(int)minValue;
    //int b=(int)maxValue;
    char a='#';
    char b='\u0023';
    char c=35;
    void display(){
        //System.out.println(minValue);
        //System.out.println(maxValue);
        //System.out.println(a);
        //System.out.println(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        CharDEMO cd=new CharDEMO();
        cd.display();
    }
}

