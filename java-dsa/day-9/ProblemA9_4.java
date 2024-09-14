// Given an integer input N, print all multiples of 4 less than or equal to N.

import java.util.Scanner;

public class ProblemA9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int i = 4; i <= N; i += 4) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
