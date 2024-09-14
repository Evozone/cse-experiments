/*
Take three numbers from the user, i.e. nl, n2 and n3.
Now your target is Print the output in the following ways:
In the first line: print "Number 1 is " then nl
In the second line: print "Number 2 is " then n2
In the third line: print 'Number 3 is • then n3
In the fourth line: print '(nl < n2) condition is then print boolean result of (nl < n2).
In the fifth line: print "(n2 == n3) condition is • then print boolean result of (n2 == n3).
In the sixth line: print "(nl < n2) && (n2 == n3) condition is " then print boolean result of (nl <
n2) && (n2 == n3).
*/

import java.util.Scanner; // For user input

public class ProblemA5_2 {
    public static void main(String[] args) {
        // Take input upto Long
        Scanner sc = new Scanner(System.in);
        long nl = sc.nextLong();
        long n2 = sc.nextLong();
        long n3 = sc.nextLong();

        // Print the sum
        System.out.println("Number 1 is " + nl);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println("(nl < n2) condition is " + (nl < n2));
        System.out.println("(n2 == n3) condition is " + (n2 == n3));
        System.out.println("(nl < n2) && (n2 n3) condition is " + ((nl < n2) && (n2 == n3)));

        sc.close();
    }
}
