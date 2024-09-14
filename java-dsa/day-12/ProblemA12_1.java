/*
Given an integer N, print N stars in a single line.
For example if N = 5 then pattern will be like:
*****
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }

        sc.close();
    }
}