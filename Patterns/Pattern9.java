package JavaPrograms.Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int row = 0; row < n; row++){
            for(int s = 0; s < row; s++ ){
                System.out.print(" ");
            }
            int c = n - row;
            for(int col = 0; col < 2 * c - 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
