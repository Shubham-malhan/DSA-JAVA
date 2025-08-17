package JavaPrograms.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 7, 10, 15, 21};
        int target = 2;
        System.out.println(binary(arr, target));  
    }

    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            
            if(target == arr[mid]){
                return mid;
            }

            if(arr[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        } 
        return -1;
    }
}
