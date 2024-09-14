/*
Take an integer A as input, you have to tell whether it is a prime number or not.
A prime number is a natural number greater than 1 which is divisible only by 1 and itself
*/

import java.util.Scanner; // For taking input from the user
import java.lang.Math; // For using sqrt() function

public class ProblemA11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();

        // Logic
        boolean isPrime = true;
        // Only need to check till sqrt(A)
        for (int i = 2; i < Math.sqrt(A); i++) {
            if (A % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}
