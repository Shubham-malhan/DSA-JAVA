package JavaPrograms.Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(1234);
        // System.out.println();
    }

    static void  reverseNumber(int n) {
        if(n == 0){
            return;
        }
        System.out.print(n % 10);
        reverseNumber(n / 10);
    }
}
