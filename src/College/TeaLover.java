package College;
class TeaLoverException extends Exception{
    TeaLoverException (String message){
        super(message);
    }
}
public class TeaLover {
    static void orderTea(String teaType) throws TeaLoverException{
        if(!teaType.equalsIgnoreCase("ginger")){
        throw new TeaLoverException("Blood Group: Tea +ve");
    }
        System.out.println("Enjoy your tea buddy");
}
    public static void main(String[] args) {
        try{
            orderTea("Green");
        }
        catch (TeaLoverException e){
            System.out.println("Exception caught:"+e.getMessage());
        }
        finally {
            System.out.println("Now Find a filter Coffee");
        }
    }
}
