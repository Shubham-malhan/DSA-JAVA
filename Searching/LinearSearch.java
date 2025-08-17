package JavaPrograms.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 7, 10, 15, 21};
        int target = 2;
        System.out.println(linear(arr, target));
    }


    static int linear(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
