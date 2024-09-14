/*
Write a program that asks the user to input a number N. If N is between 10 and 20, your
program should ask the user to enter another number M and then:-
Print the sum of the two numbers.
•
If the sum is greater than equal to 100, your program should also print "That is a
large sum!" on a new line.
If N is not between 10 and 20, your program should print -1.
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA8_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        if (N >= 10 && N <= 20) {
            System.out.println("Enter another number: ");
            int M = sc.nextInt();
            int sum = N + M;
            System.out.println(sum);
            if (sum >= 100) {
                System.out.println("That is a large sum!");
            }
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
