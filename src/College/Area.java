package College;

public class Area {
    double area(double r){
        System.out.println("Area of circle");
        return 3.14*r*r;
    }
    int area(int l,int b) {
        System.out.println("Area of rectangle");
        return l*b;
    }
    int area(int b ) {
        System.out.println("Area of Square");
        return b*b;
    }

    public static void main(String[] args) {
        Area ar= new Area();
        System.out.println(ar.area(2.0));
        System.out.println(ar.area(2,5));
        System.out.println(ar.area(2));
    }
}
