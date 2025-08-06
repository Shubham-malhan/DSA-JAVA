package JavaPrograms.Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int s = 1; s <= n - row; s++){
                System.out.print(" ");
            }
            int c = row * 2 - 1; 
            for(int col = 1; col <= c ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
