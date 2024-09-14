/*
Given the number N, Categorise the number according to following condition :
1. Odd-Positive
2. Odd-Negative
3. Even-Positive
4. Even-Negative
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        if (N % 2 == 0) {
            if (N > 0) {
                System.out.println("Even-Positive");
            } else {
                System.out.println("Even-Negative");
            }
        } else {
            if (N > 0) {
                System.out.println("Odd-Positive");
            } else {
                System.out.println("Odd-Negative");
            }
        }

        sc.close();
    }
}
