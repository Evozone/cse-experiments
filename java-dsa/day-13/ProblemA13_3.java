/*
Take an integer N as input, print the corresponding pattern for N
For example if N = 5 then pattern will be like:

1
1 2
1 2 3
1 2 3 4

*/

import java.util.Scanner; // For taking input from the user

public class ProblemA13_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int row = 1; row <= N; row++) {
            // Print the numbers, limit is the row number
            for (int digit = 1; digit <= row; digit++) {
                System.out.print(digit + " ");
            }
            // Go to the next line
            System.out.println();
        }

        sc.close();
    }
}