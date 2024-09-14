/*
Write a program to input two numbers(A & B) from user and print the maximum element
among A & B in each line.
*/

import java.util.Scanner; // Input

public class ProblemA7_7 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Print the maximum element
        if (A > B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }

        sc.close();
    }
}

// An IF statement in Java is also a _____ statement.
// a. boolean
// b. conditional
// c. iterative
// d. optional

// Answer: b. conditional