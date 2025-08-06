package JavaPrograms.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
        for(int row = 0; row <= 2 * n; row++){
            int c = row < n ? row : 2 * n - row;
            for(int col = 0; col <= c; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
