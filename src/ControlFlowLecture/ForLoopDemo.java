package ControlFlowLecture;

public class ForLoopDemo {
    public static void main(String[] args) {
        int i=1,j=20;                                                           // we can also initialize here
        for( i=2,j=10;i<=j;i++,j--);{                           //for(i++,System.out.println(i);i<=10;i++){   it is allowed                        //initialization part is optional and increment decrement is also optional
            System.out.println(i);
            //i++;                                                           // here we use updating
            //break;
        }
    }
}
