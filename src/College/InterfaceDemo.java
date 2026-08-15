package College;
interface Human{
    void power();
    default void identity(){
        System.out.println("Gangadhar");
    }
}
interface Energy{
    void energy();
}
class Shaktiman implements Human,Energy{
    @Override
    public void power(){
        System.out.println("Five Elements");
    }
    @Override
    public void energy(){
        System.out.println("sun");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Shaktiman obj=new Shaktiman();
        obj.energy();
        obj.power();
        obj.identity();
        Human ob=new Shaktiman();
        ob.identity();
        ob.power();
    }
}
