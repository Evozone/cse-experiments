// Given a number A. Return the square of the number using functions.

import java.util.Scanner; // For taking input from the user

public class ProblemA14_4 {
    public static int square(int A) {
        // Base case
        if (A == 0) {
            return 0;
        }

        // Recursive case
        return 2 * A - 1 + square(A - 1);
        // Explanation:
        // 1 = 1
        // 2 = 1 + 3
        // 3 = 1 + 3 + 5
        // 4 = 1 + 3 + 5 + 7
        // 5 = 1 + 3 + 5 + 7 + 9
        // The square of a number is the sum of first N odd numbers.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();

        // Logic
        int square = square(A);

        // Output
        System.out.println(square);

        sc.close();
    }
}