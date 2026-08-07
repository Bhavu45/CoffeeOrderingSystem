package Practice;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        int age=23;
        int salary=80000;
        if(age>24&&salary>50000){
            System.out.println("You can apply for credit card");
        }
        else{
            System.out.println("You cannot apply for credit card");
        }
        int a=5,b=3,c=2;
        boolean result=(a>b)&&(b!=c)||!(a<c+b);
        System.out.println(result);
    }
}
