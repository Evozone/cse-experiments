/*
Given marks of a student M, if his/her marks 50 then the student has passed the exam
otherwise failed. If a student passes the exam, print PASS and also the grade of student,
grading system -

1. Marks are between [50,801] -> B
2. Marks are between [81,1001] -> A
But if the student fails the exam, then print FAIL
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA8_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int marks = sc.nextInt();

        // Logic
        if (marks >= 50 && marks <= 80) {
            System.out.println("PASS : B");
        } else if (marks >= 81 && marks <= 100) {
            System.out.println("PASS : A");
        } else {
            System.out.println("FAIL");
        }

        sc.close();
    }
}
