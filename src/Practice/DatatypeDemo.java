package Practice;

public class DatatypeDemo {
     byte day=6;
     short year=2006;
     int population=2000035673;
     long stars=1000000000234423141L;
    public static void main(String[] args) {
        DatatypeDemo d=new DatatypeDemo();
        System.out.println(d.day);
        System.out.println("The current year is:"+d.year);
        System.out.println(d.population);
        System.out.println(d.stars);
    }
}
