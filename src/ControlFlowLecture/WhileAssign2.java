package ControlFlowLecture;

public class WhileAssign2 {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<500;i++){
            if (i%3==0&&i%5==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
