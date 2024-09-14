/*
 * Your younger brother is going to a modern school. In his school, there was a
 * coding
 * competition planned. The pannel asked a question "Write a program which can
 * perform the
 * task - Add two numbers and divide them by a third number and print the
 * remainder.
 * You are a programmer and your brother asks you to write a code that helps him
 * to check his
 * approach.
 */

import java.util.Scanner; // For user input

class ProblemA5_1 {
    public static void main(String[] args) {
        // Take input upto Long
        Scanner sc = new Scanner(System.in);
        long N1 = sc.nextLong();
        long N2 = sc.nextLong();
        long N3 = sc.nextLong();

        // Print the sum
        System.out.println((long) ((N1 + N2) % N3));

        sc.close();
    }
}