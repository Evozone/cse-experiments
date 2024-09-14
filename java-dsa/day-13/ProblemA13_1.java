/*
Take an integer N as input, print the corresponding pattern for N
For example if N = 5 then pattern will be like:

    *
   **
  ***
 ****
*****

*/

import java.util.Scanner; // For taking input from the user

public class ProblemA13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int i = 1; i <= N; i++) {
            // Print the spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Print the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Go to the next line
            System.out.println();
        }

        sc.close();
    }
}