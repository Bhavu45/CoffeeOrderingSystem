package Practice;

public class CarInfo {
    String model;
    int year;
    String color;
    void display(){
        System.out.println("The car model is "+model+" manufactured in the year "+year+ " and its color is "+color);
    }
    void accelerate(){
        System.out.println("Car "+model+" is accelerated by Bhavya");
    }
    void brake(){
        System.out.println("Car "+model+" has 2 brakes");
    }
    void speed(){
        System.out.println("The car "+model+" speed is very fast");
    }
}
class CarMain{
    public static void main(String[] args){
        CarInfo obj=new CarInfo();
        obj.model="Tata";
        obj.year=2010;
        obj.color="red";
        obj.display();
        obj.accelerate();
        obj.brake();
        obj.speed();
    }
}
