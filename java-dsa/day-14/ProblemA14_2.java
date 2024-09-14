// Given two numbers A & B. Return their sum using functions.

import java.util.Scanner; // For taking input from the user

public class ProblemA14_2 {
    public static int sum(int A, int B) {
        // Base case
        if (B == 0) {
            return A;
        }

        // Recursive case
        return sum(A + 1, B - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Logic
        int sum = sum(A, B);

        // Output
        System.out.println(sum);

        sc.close();
    }
}