/*
Given a Number N, if The number is divisible by 5,
print "Divisible by 5", otherwise print "Not Divisible by 5".
 */

import java.util.Scanner; // Input

public class ProblemA7_4 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Check if the number is divisible by 5 or not
        if (N % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not Divisible by 5");
        }

        sc.close();
    }
}
