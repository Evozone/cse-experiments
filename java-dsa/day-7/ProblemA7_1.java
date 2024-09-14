/*
Write a program to input an integet from user and print 1 if it is odd otherwise print 0.
*/

import java.util.Scanner; // For taking input

public class ProblemA7_1 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Print the result
        System.out.println(N % 2);

        sc.close();
    }
}
