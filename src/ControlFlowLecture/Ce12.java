package ControlFlowLecture;

public class Ce12 {
    public static void main(String[] args) {
        enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday,Funday}
        Day day=Day.Funday;
        String result= switch (day){
            case Monday,Tuesday,Wednesday,Thursday,Friday->"Weekday";
            case Saturday,Sunday->"Weekend";
            default -> "Invalid choice";
        };
        System.out.println(result);
    }
}
