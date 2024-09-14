/*
Take T (number of test cases) as input.
For each test case, take integer N as input and Print the last digit of that number.
 */

import java.util.Scanner; // For taking input from the user

public class ProblemA10_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int T = sc.nextInt();

        // Logic
        for (int i = 0; i < T; i++) {
            // Take input T times
            int N = sc.nextInt();
            // Print the last digit
            System.out.println(N % 10);
        }

        sc.close();
    }
}
