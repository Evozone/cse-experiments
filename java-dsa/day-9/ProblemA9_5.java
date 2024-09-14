// Given a number N, print the last digit of the number.

import java.util.Scanner; // For taking input from the user

public class ProblemA9_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        System.out.println(N % 10);

        sc.close();
    }
}
