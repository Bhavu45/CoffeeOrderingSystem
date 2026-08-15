package College;
import java.util.Arrays;
public class SelectionSort {
    static void selectionSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for (int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={77,18,45,17,10,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
