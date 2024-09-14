// Given two numbers A & B. Return their product using functions.

import java.util.Scanner; // For taking input from the user

public class ProblemA14_3 {
    public static int product(int A, int B) {
        // Base case
        if (B == 0) {
            return 0;
        }

        // Recursive case
        return A + product(A, B - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Logic
        int product = product(A, B);

        // Output
        System.out.println(product);

        sc.close();
    }
}