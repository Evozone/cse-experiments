/*
Take three numbers from user, i.e. n1, n2 and n3.
Now your target is Print the output in following ways:
In first line : print 'Number 1 is • then n1
In second line : print "Number 2 is " then n2
In third line : print "Number 3 is " then n3
In fourth line : print "(n1 > n2) condition is " then print boolean result of (n1 > n2).
In fifth line : print "(n2 <= n3) condition is " then print boolean result of (n2 <= n3).
In sixth line : print '(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is " then print boolean
result of (n1 < n2) || ((n2 == n3) && (n1 < n3)).
 */

import java.util.Scanner; // For user input

public class ProblemA5_3 {
    public static void main(String[] args) {
        // Take input upto Long
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        long n3 = sc.nextLong();

        // Print the sum
        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println("(n1 > n2) condition is " + (n1 > n2));
        System.out.println("(n2 <= n3) condition is " + (n2 <= n3));
        System.out.println(
                "(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is " + ((n1 < n2) || ((n2 == n3) && (n1 < n3))));

        sc.close();
    }
}
