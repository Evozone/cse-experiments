/*
Rahul has N Apples initially, Karan has M apples initially. Rahul gave 5 apples to Karan and
after some time Rahul plucked 2 times Initial apples (N) he had from Tree. Find out the total
number of apples Rahul and Karan are left with.
*/

import java.util.Scanner; // For taking input

public class ProblemA6_2 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Rahul gave 5 apples to Karan
        int Rahul = N - 5;
        int Karan = M + 5;

        // Rahul plucked 2 times Initial apples (N) he had from Tree
        Rahul = Rahul + 2 * N;

        // Print the result
        System.out.println("Rahul has " + Rahul + " apples");
        System.out.println("Karan has " + Karan + " apples");

        sc.close();
    }
}
