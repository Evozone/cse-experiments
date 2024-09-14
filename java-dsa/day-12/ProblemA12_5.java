// Take an integer N as input, print the corresponding pattern for N
// For example if N = 5 then pattern will be like:
/*
**********
****  ****
***    ***
**      **
*        *
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA12_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int i = 1; i <= N; i++) {
            // Print the first half of the row
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print("*");
            }

            // Print the spaces
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }

            // Print the second half of the row
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print("*");
            }

            // Go to the next line
            System.out.println();
        }

        sc.close();
    }
}