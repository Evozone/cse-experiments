/*
 * You'll write some code to help you cook a gorgeous lasagna from your favorite cookbook.
Now, you also want to add a few layers to the lasagna. Assume **each layer takes 2
minutes** to prepare. Given the number of layers you want to add to the lasagna, find how many
minutes you would spend making them.
 */

import java.util.Scanner; // To use Scanner for user input

public class ProblemA4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the number of layers you want to add to the lasagna: ");
        int layers = scan.nextInt(); // Read user input

        int minutes = layers * 2; // Calculate the number of minutes to prepare the layers

        System.out.println(minutes);

        scan.close(); // Close the Scanner
    }
}
