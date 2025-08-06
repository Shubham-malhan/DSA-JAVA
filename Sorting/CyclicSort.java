
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,7,9,11,12};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else {
                i++; 
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i]; 
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
