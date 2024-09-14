/*
Take T (number of test cases) as input.
For each test case, take integer N as input and Print the sum of digits of that number.
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA10_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int T = sc.nextInt();

        // Logic
        for (int i = 0; i < T; i++) {
            // Take input T times
            int N = sc.nextInt();
            int sum = 0;
            while (N > 0) {
                // Extract the last digit and add it to sum
                sum += N % 10;
                // Remove the last digit
                N /= 10;
            }
            System.out.println(sum);
        }

        sc.close();
    }
}
