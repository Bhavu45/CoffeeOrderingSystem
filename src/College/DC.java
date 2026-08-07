package College;

class SuperHero {
    void fight() {
        System.out.println("Superhero saves teh world");
    }
}
class SuperMan extends SuperHero{
    void identity(){
        System.out.println("Henry Cavil");
    }
}
class WonderWomen extends SuperHero{
    void identity(){
        System.out.println("Gal Gadot");
    }
}
public class DC{
    public static void main(String[] args) {
        SuperMan s= new SuperMan();
        s.fight();
        s.identity();

        WonderWomen w=new WonderWomen();
        w.fight();
        w.identity();
    }
}
