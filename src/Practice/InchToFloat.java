package Practice;

public class InchToFloat{
    double i=61.8d;
    void display(){
        double result=i*0.0833333;
        System.out.println("Result : "+result);
    }
    public static void main (String[] args){
        InchToFloat m=new InchToFloat();
        m.display();
    }
}

