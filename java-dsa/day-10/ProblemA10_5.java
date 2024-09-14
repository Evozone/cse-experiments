/*
Determine whether an integer is a palindrome. Do this without extra space.
A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its
digit reversed. Negative numbers are not palindromic.
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA10_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        String N = sc.next();

        // Logic
        for (int i = 1; i <= N.length() / 2; i++) {
            if (N.charAt(i - 1) != N.charAt(N.length() - i)) {
                System.out.println("Not a palindrome");
                System.exit(0);
            }
        }

        System.out.println("Palindrome");

        sc.close();
    }
}
