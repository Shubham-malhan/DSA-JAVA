package JavaPrograms.Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int c = n > row ? n - row : row - n + 1;
            int sg = n > row ? row : 2 * n - row - 1;
            for (int s = 0; s < sg; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
