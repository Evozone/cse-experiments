/*
Take T (number of test cases) as input.
For each test case, take integer N as input and Check whether that number is Palindromic /
Not Palindromic.
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA10_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int T = sc.nextInt();

        // Logic
        for (int i = 0; i < T; i++) {
            // Take input T times
            int N = sc.nextInt();
            int temp = N;
            int reverse = 0;
            while (N > 0) {
                reverse = reverse * 10 + N % 10;
                N /= 10;
            }
            if (temp == reverse) {
                System.out.println("Palindromic");
            } else {
                System.out.println("Not Palindromic");
            }
        }

        sc.close();
    }
}
