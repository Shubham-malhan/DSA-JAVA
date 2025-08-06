package JavaPrograms.Patterns;

public class pattern2 {
    public static void main(String[] args) {
        // Pattern1 h = new Pattern1();
        // h.pattern(5);
        // System.out.println(h);
        pattern(5);
    }

    static void pattern(int n){
        for (int row = 0; row < n; row++) {
            for(int col = 0; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
