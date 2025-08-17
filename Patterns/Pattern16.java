package JavaPrograms.Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int row = 0; row < n; row++){
            for(int s = 0; s < n - row - 1; s++){
                System.out.print("  ");
            }

            int num = 1;
            for (int col = 0; col <= row; col++) {
                System.out.printf("%4d", num);
                num = num * (row - col) / (col + 1); // Compute binomial coefficient
            }
            System.out.println();
        }
    }
}
