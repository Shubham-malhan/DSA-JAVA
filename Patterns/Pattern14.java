package JavaPrograms.Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int row = 0; row < n; row++) {
            for(int s = 0; s < row; s++){
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * n - row - 1; col++) {
                if (col == 0 || col == 2 * (n - row) - 2  || row == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }   
            }
            System.out.println();
        }
    }
}
