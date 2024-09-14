/*
 * Given three numbers A, B and C, Add them and print their sum.
 */

import java.util.Scanner; // For user input

public class ProblemA4_4 {
    public static void main(String[] args) {
        // Take input upto Long
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        // Print the sum
        System.out.println((long) (a + b + c));

        sc.close();
    }
}
