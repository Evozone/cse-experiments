/*
Take three numbers from user, i.e. n1, n2 and n3.
You have to print numbers taken by user as :
In First Line : "Number 1 is " then n1.
In Second Line : "Number 2 is • then n2.
In Third Line : 'Number 3 is " then n3.
then In Fourth Line print •true", if all the conditions is true from the following:
Condition 1 : n1 < 50
Condition 2 : n2 > n3
Condition 3 : n2 <= n3
Otherwise print false.
 */

import java.util.Scanner; // For user input

public class ProblemA5_4 {
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

        System.out.println((n1 < 50) && (n2 > n3) && (n2 <= n3));

        sc.close();
    }
}
