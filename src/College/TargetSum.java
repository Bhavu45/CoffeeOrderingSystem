package College;

public class TargetSum {
    public static boolean SlidingWindow(int[] arr,int k,int target) {
        int ws = 0;
        for (int i = 0; i <k; i++) {
            ws += arr[i];
        }
        if (ws == target) return true;
        for (int i = k; i < arr.length; i++) {
            ws += arr[i] - arr[i - k];
            if (ws == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 2, 8, 7, 4, 9};
        int k = 3;
        int target = 20;
        boolean result = SlidingWindow(arr, k, target);
        if (result) {
            System.out.println("Target Found");
        } else {
            System.out.println("Target Not Found");
        }
    }
}

