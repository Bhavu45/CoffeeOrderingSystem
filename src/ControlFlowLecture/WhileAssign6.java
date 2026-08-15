package ControlFlowLecture;
//Program to print Armstrong numbers from 1 to 1000
// Armstrong number: 153 it is a 3 digit number so 1^3+5^3+3^3
public class WhileAssign6 {
    public static void main(String[] args) {
        for (int num=1;num<=1000;num++) {
            int original = num;
            int temp=num;
            int sum = 0;
            while (temp!= 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp/=10;
            }
            if (original==sum){
                System.out.println(original);
            }
        }
    }
}
