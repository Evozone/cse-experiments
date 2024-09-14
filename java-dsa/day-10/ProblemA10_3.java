// Given two numbers A and B, print all the numbers from A to B in a single line
// Use while

import java.util.Scanner; // For taking input from the user

public class ProblemA10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Logic
        int i = A;
        while (i <= B) {
            System.out.print(i + " ");
            i++;
        }

        sc.close();
    }
}
