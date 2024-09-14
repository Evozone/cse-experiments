// Print a pattern consisting of N rows, where each row contains an asterisk (*) at the
// beginning and end of the line, with N-2 spaces in between.
// The Pattern should look like:
// *<N-2 Spaces>*
// Print the above pattern for a total of N Rows.

import java.util.Scanner; // For taking input from the user

public class ProblemA13_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int i = 1; i <= N; i++) {
            // Print the first star
            System.out.print("*");

            // Print the spaces
            for (int j = 1; j <= N - 2; j++) {
                System.out.print(" ");
            }

            // Print the last star
            System.out.print("*");

            // Go to the next line
            System.out.println();
        }

        sc.close();
    }
}
