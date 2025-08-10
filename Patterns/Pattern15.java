package JavaPrograms.Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 0; row < 2 * n - 1; row++) {
            int sg = n > row ? n - row - 1 : row - n + 1;
            for (int s = 0; s < sg; s++) {
                System.out.print(" ");
            }
            int c = n > row ? 2 * row + 1 : 2 * (2 * n - row - 2) + 1;
            for (int col = 0; col < c; col++) {
                int expectedCol = n > row ? 2 * row : 2 * (2 * n - row - 2);
                if (col == 0 || col == expectedCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
