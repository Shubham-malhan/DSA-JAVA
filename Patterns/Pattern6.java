package JavaPrograms.Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        pattern(4);
    }    

    static void pattern(int n){
        for(int row = 0; row <= n; row++){
            for(int s = 0; s < n - row; s++){
                System.out.print(" ");
            }
            for(int col = 0; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
