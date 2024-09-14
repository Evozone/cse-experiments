// Print the following pattern in output
//    *  
//   **  
//  ***
// ****
//*****

public class ProblemA2_4 {
    public static void main(String[] args) {
        int sizeOfMatrix = 5;
        // Number of rows
        for (int i = 1; i <= sizeOfMatrix; i++) {
            // Number of spaces
            for (int j = 1; j <= sizeOfMatrix - i; j++) {
                System.out.print(" ");
            }
            // Number of stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
