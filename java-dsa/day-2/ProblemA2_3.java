// Print the following pattern in output
// *****
// ****
// ***
// **
// *

public class ProblemA2_3 {
    public static void main(String[] args) {
        // Outer loop for number of rows
        for (int i = 5; i > 0; i--) {
            // Inner loop for number of columns
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                // No need for whitespaces as everything is left aligned
            }
            System.out.println();
        }
    }
}
