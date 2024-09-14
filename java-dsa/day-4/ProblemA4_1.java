/*
 * You're going to write some code to help you cook a gorgeous lasagna from your favorite
cookbook. According to your cookbook, the Lasagna should be in the oven for 40 minutes.
Given the time (in minutes), the lasagna has been in the oven, find how many more minutes
the lasagna still needs to bake for.
 */

import java.util.Scanner; // Used for user input

public class ProblemA4_1 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the time the lasagna has been in the oven
        System.out.print("Enter the time the lasagna has been in the oven: ");
        int timeInOven = input.nextInt();

        // Calculate the remaining time
        int remainingTime = 40 - timeInOven;

        // Display the remaining time
        System.out.println("The lasagna still needs to bake for " + remainingTime + " minutes.");

        // Close the Scanner object
        input.close();
    }
}
