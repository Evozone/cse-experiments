// Given A, B, X and Y, print all the numbers from A to B except X and Y

import java.util.Scanner; // For taking input from the user

public class ProblemA11_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        // Logic
        for (int i = A; i <= B; i++) {
            if (i != X && i != Y) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}