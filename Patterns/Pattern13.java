package JavaPrograms.Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n){
        for(int row = 0; row < n; row++){
            int expectedCol = row == 0 ? row : row == n - 1 ? 2*n -1  : 1;
            for(int s = 0; s < n - row - 1; s++){
                System.out.print(" ");
            }
            // int c = row * 2 - 1;
            for(int col = 0; col <= expectedCol; col++){
                System.out.print("*");
                if (row > 0 && row < n -1) {
                    for(int s2 = 0; s2 < row * 2 - 1; s2++){
                        System.out.print(" ");
                    }
                }
            }
            
            System.out.println();
        }
    }

//     static void pattern(int n) {
//     for (int row = 0; row < n; row++) {
//         // Print leading spaces for alignment
//         for (int s = 0; s < n - row - 1; s++) {
//             System.out.print(" ");
//         }

//         // Print stars and spaces for hollow effect
//         for (int col = 0; col < (2 * row + 1); col++) {
//             // Print stars at the edges or the last row
//             if (col == 0 || col == (2 * row) || row == n - 1) {
//                 System.out.print("*");
//             } else {
//                 System.out.print(" ");
//             }
//         }
        
//         // Move to the next line after each row
//         System.out.println();
//     }
// }

}
