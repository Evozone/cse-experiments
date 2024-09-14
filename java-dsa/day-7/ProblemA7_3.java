/*
Write a program to input a number(A) from user and print 1 if it is positive, -1 if it is negative, O if it's neither positive nor negative.
*/

import java.util.Scanner; // Input 

public class ProblemA7_3 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        // Check if the number is positive, negative or neither
        if (A > 0) {
            System.out.println("1");
        } else if (A < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }

        sc.close();
    }
}
