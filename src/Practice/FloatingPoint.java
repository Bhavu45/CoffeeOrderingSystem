package Practice;

public class FloatingPoint {
    float marks = (float)98.99;

    void display() {
        System.out.println("Marks = " + marks);
    }
}
class Fp{
    public static void main(String[] args) {
        FloatingPoint fp=new FloatingPoint();
        fp.display();
    }
}
