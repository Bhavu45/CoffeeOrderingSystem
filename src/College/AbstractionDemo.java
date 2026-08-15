package College;
abstract class Omnitrix{
    String owner;
    Omnitrix(String owner){
        this.owner=owner;
        System.out.println("Omnitrix : "+owner);
    }
    abstract void transform();
    void activate(){
        System.out.println("Omnitrix Activated");
    }
}
class Ben10 extends Omnitrix{
    Ben10(String owner){
        super(owner);
    }
    @Override
    void transform(){
        System.out.println(owner+"Transforms to Canon Bolt");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Omnitrix ben=new Ben10("Ben 10");
        ben.transform();
        ben.activate();
    }
}
