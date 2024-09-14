/*
 * Given an integer N, print the corresponding Inverted Half Pyramid pattern for
 * N.
 * For example if N = 4 then pattern will be like:
 * ****
 * ***
 * **
 * *
 */

import java.util.Scanner; // For taking input from the user

public class ProblemA12_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Go to the next line
            System.out.println();
        }

        sc.close();
    }
}