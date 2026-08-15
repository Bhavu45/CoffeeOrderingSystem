package Practice;

public class Height {
    double height=5.4;
    void calculateHeight(){
        System.out.println("Practice.Height in feet : "+height);
        double meter_height= height*0.3048f;
        System.out.println("Practice.Height in meters : "+meter_height+"m");
    }

    public static void main(String[] args) {
        Height h=new Height();
        h.calculateHeight();
    }
}
