/*
Write a program to print all even Natural numbers from 1 to N where you have to take N as input
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int i = 2; i <= N; i += 2) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
