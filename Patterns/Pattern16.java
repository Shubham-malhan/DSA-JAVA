package JavaPrograms.Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int s = 1; s <= 2 * n + 1 - row; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                if(col == 1 || col == row ){
                    System.out.print(1 + " ");
                } else {
                    System.out.print(row - 1 + " ");
                }
                // int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                // System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
