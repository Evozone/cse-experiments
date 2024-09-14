/*
Given two integers A and B, where A is divisible by B
Print the value of quotient, when A is divided by B using functions.
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA14_5 {
    public static int quotient(int A, int B) {
        // Base case
        if (A < B) {
            return 0;
        }

        // Recursive case
        return 1 + quotient(A - B, B);
        // Explanation:
        // 10 / 3 = 1 + quotient(7, 3)
        // 7 / 3 = 1 + quotient(4, 3)
        // 4 / 3 = 1 + quotient(1, 3)
        // 1 / 3 = 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Logic
        int quotient = quotient(A, B);

        // Output
        System.out.println(quotient);

        sc.close();
    }
}