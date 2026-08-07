package College;
import java.util.Arrays;
public class InsertionSort {
    static void insertionSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j;
            for(j=i-1;j>=0&&arr[j]>key;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;
        }
        }

    public static void main(String[] args) {
        int [] arr={77,18,45,17,10,1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
