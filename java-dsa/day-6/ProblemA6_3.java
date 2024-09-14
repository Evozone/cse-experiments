/*
Given an integer A, find the volume of a cube with side (A+1).
Use the shorthand increments
*/

import java.util.Scanner; // For taking input

public class ProblemA6_3 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        // Find the volume of a cube with side (A+1)
        int volume = (++A) * (A) * (A);

        // Print the result
        System.out.println("Volume of a cube with side (A+1) is " + volume);

        sc.close();
    }
}
