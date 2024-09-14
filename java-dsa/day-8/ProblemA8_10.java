// You are given an integer A. You have to tell how many days are there in the month A in a non-leap year.  

import java.util.Scanner; // For taking input from the user

public class ProblemA8_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int A = sc.nextInt();

        // Logic
        if (A == 1 || A == 3 || A == 5 || A == 7 || A == 8 || A == 10 || A == 12) {
            System.out.println(31);
        } else if (A == 4 || A == 6 || A == 9 || A == 11) {
            System.out.println(30);
        } else if (A == 2) {
            System.out.println(28);
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
