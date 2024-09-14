/*
Take an integer N as input and print its factors.
The factor of a number is the number that divides it perfectly leaving no remainder.
Example: 1, 2, 3, and 6 are factors of 6.
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
