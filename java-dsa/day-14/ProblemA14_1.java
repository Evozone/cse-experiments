// Given a number N, return factorial of N

import java.util.Scanner; // For taking input from the user

public class ProblemA14_1 {
    public static int factorial(int N) {
        // Base case
        if (N == 0) {
            return 1;
        }

        // Recursive case
        return N * factorial(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        int fact = factorial(N);

        // Output
        System.out.println(fact);

        sc.close();
    }
}