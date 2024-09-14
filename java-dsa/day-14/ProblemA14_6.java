// You are given an integer A.
// Find the value of cube of A using functions.

import java.util.Scanner; // For taking input from the user

public class ProblemA14_6 {
    public static int cube(int A) {
        return A * A * A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();

        // Logic
        int cube = cube(A);

        // Output
        System.out.println(cube);

        sc.close();
    }
}