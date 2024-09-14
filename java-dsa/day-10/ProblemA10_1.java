/*
Write a program to print all Natural numbers from 1 to N where you have to take N as input
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int N = sc.nextInt();

        // Logic
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
