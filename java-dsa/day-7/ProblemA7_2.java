/*
You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether
the triangle is valid or not.
A triangle is valid if sum of its angles equals to 180.
*/

import java.util.Scanner; // For taking input

public class ProblemA7_2 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Check if the triangle is valid or not
        if (A + B + C == 180) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        sc.close();
    }
}
