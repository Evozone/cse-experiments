/*
You are given a variable X, modify it susing the following steps.
1. Make X five times grater than the original value
2. Increment the value of X by 10.
3. Divide the value of X by 2.
*/

import java.util.Scanner; // For taking input

public class ProblemA6_4 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        // Modify X
        X *= 5;
        X += 10;
        X /= 2;

        // Print the result
        System.out.println("X is " + X);

        sc.close();
    }
}
