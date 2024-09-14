// Write a program to input three numbers and print the largest of them.

import java.util.Scanner; // For taking input from the user

public class ProblemA8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Logic
        if (A > B) {
            if (A > C) {
                System.out.println(A);
            } else {
                System.out.println(C);
            }
        } else {
            if (B > C) {
                System.out.println(B);
            } else {
                System.out.println(C);
            }
        }

        sc.close();
    }
}
