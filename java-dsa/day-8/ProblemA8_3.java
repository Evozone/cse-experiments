/*
Given age of a person, Categorise it based on age.
Category is given below :
if age is in range of O to 12 then category is "Child",
Otherwise if age is in range of 13 to 19 then category is "Teenager",
Otherwise if age is in range of 20 to 40 then category is "Young"
Otherwise if age is in range of 41 to 60 then category is "Middle-Aged",
Otherwise if age is more than 60 than category is "Senior-Citizen"
Note : Intention of this problem is to give you intuition of if-elseif, try to solve this problem
using else-if. 
*/

import java.util.Scanner; // For taking input from the user

public class ProblemA8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int age = sc.nextInt();

        // Logic
        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 40) {
            System.out.println("Young");
        } else if (age >= 41 && age <= 60) {
            System.out.println("Middle-Aged");
        } else if (age > 60) {
            System.out.println("Senior-Citizen");
        } else {
            System.out.println("Invalid age");
        }

        sc.close();
    }
}
