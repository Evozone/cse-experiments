// Given a number N, print the reverse of N

import java.util.Scanner; // For taking input from the user

public class ProblemA10_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        int reverse = 0;
        while (N > 0) {
            reverse = reverse * 10 + N % 10;
            N /= 10;
        }
        System.out.println(reverse);

        sc.close();
    }
}
