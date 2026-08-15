package ControlFlowLecture;

public class JumpStatements {
    public static void main(String[] args) {
        // program to print even and odd numbers from 1 to 10 using continue
        for (int i=1;i<=10;i++){
            //for even
            //if(i%2!=0)
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }
//        for (int i=1;i<=10;i++){
//            if (i==5){
////                break;
//                continue;
//            }
//            System.out.println(i);
//        }
//         int i=2;
//         label:if (i==2){
////             break label;                // in this case break is  not allowed  only when if is inside loop or switch we can use break but labeled break is possible
//         }
//        outerLoop:for (int i=0;i<3;i++){                                               // it exits from all loops
//            ineerLoop:for (int j=0;j<3;j++){
//                if (i==1 && j==1){
//                    System.out.println("Breaking from both loops");
//                    break outerLoop;                                                         // it breaks from inner loop
//                }
//                System.out.println("i: "+i+", j: "+j);
//            }
//        }
    }
}
