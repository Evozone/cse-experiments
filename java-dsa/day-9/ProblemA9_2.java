/*
Write a program to print all Natural numbers from N to 1 where you have to take N as input
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
