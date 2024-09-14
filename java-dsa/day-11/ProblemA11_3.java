/*
implement a program that takes two positive integers A and B in the input and prints their
LCM.
Definition of LCM : The Least Common Multiple or LCM of two numbers say A and B, is
denoted as LCM (A,B). And the LCM is the smallest or least positive integer that is divisible
by both A and B.
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Logic
        int lcm = 0;

        // Find the maximum of A and B
        int max = A > B ? A : B;

        // Start from max and keep incrementing by max
        for (int i = max; i <= A * B; i += max) {
            // Check if i is divisible by B, since it is already divisible by A
            if (i % B == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println(lcm);

        sc.close();
    }
}
