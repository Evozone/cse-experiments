/*
Write a program to input two integers A & B from user and print their HCF.
Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor)
of two positive integers happens to be the largest positive integer that divides the numbers
without leaving a remainder.
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA11_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Logic
        int hcf = 0;

        // Using Euclid's Algorithm

        // Find the maximum of A and B
        int max = A > B ? A : B;

        // Start from max and keep decrementing by 1
        for (int i = max; i >= 1; i--) {
            // Check if i divides both A and B
            if (A % i == 0 && B % i == 0) {
                hcf = i;
                break;
            }
        }

        // Output
        System.out.println(hcf);

        sc.close();
    }
}
