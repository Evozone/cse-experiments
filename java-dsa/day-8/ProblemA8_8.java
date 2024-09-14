// Write a program to input from user an integer(n) representing the rating of a person on a
// platform.
// You have to print the category of that person.
// If the rating is greater than or equal to 2100 then that person is •grand master".
// If the rating is greater than or equal to 1900 then that person is "candidate master".
// If the rating is greater than or equal to 1600 then that person is •expert".
// If the rating is greater than or equal to 1400 then that person is •pupil".
// If the rating is smaller than 1400 then that person is •newbie".
// NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise
// print in UPPERCASE

import java.util.Scanner; // For taking input from the user

public class ProblemA8_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int n = sc.nextInt();

        // Logic
        if (n >= 2100) {
            if (n % 2 == 0) {
                System.out.println("GRAND MASTER");
            } else {
                System.out.println("grand master");
            }
        } else if (n >= 1900) {
            if (n % 2 == 0) {
                System.out.println("CANDIDATE MASTER");
            } else {
                System.out.println("candidate master");
            }
        } else if (n >= 1600) {
            if (n % 2 == 0) {
                System.out.println("EXPERT");
            } else {
                System.out.println("expert");
            }
        } else if (n >= 1400) {
            if (n % 2 == 0) {
                System.out.println("PUPIL");
            } else {
                System.out.println("pupil");
            }
        } else {
            if (n % 2 == 0) {
                System.out.println("NEWBIE");
            } else {
                System.out.println("newbie");
            }
        }

        sc.close();
    }
}
