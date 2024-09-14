/*
Given a Number N, according to situation of N print the output.
Situations of N are
If N is greater than 18, print "N is Greater than 1 8"
Otherwise if N is less than 18, print "N is smaller than 18"
Otherwise Print "N is equal to 18".
*/

import java.util.Scanner; // Input

public class ProblemA7_5 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Check the situation of N
        if (N > 18) {
            System.out.println("N is Greater than 18");
        } else if (N < 18) {
            System.out.println("N is smaller than 18");
        } else {
            System.out.println("N is equal to 18");
        }

        sc.close();
    }
}
