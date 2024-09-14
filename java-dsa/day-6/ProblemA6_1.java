/*
Write a program to take two inpts from the user, First is String(S) and second is an Integer(N) and then print the desired output. Desired output is  - Print Integer value followed by the String value in the same line.
*/

import java.util.Scanner; // For user input

public class ProblemA6_1 {
    public static void main(String[] args) {
        // Take small input
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = sc.nextInt();

        // Print the sum
        System.out.println(N + " " + S);

        sc.close();
    }
}
