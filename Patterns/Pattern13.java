package JavaPrograms.Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int row = 0; row < n; row++){
            for(int s = 0; s < n - row - 1; s++){
                System.out.print(" ");
            }
            int c = row == 0 ? row : row < n ? 2 : 2 * n;
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
