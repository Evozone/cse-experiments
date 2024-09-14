// Write a program to input from user three numbers representing the sides of a triangle and print whether the triangle is equilateral, isosceles or scalene.

import java.util.Scanner; // For taking input from the user

public class ProblemA8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Logic
        if (A == B && B == C) {
            System.out.println("Equilateral");
        } else if (A == B || B == C || A == C) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

        sc.close();
    }
}
