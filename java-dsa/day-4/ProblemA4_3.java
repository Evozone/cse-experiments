/*
 * You wrote some code to help you cook a gorgeous lasagna from your favorite cookbook.
Now, you want to find the total number of minutes you've been cooking for the sum of your
preparation time and the time the lasagna has already spent baking in the oven. The
preparation time of one layer is 2 minutes. Given the number of layers added to the lasagna
and the number of minutes the lasagna has been baking in the oven, find the total elapsed
cooking time (prep + bake) in minutes.
 */

import java.util.Scanner; // For user input

public class ProblemA4_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of layers: ");
        int layers = input.nextInt();

        System.out.print("Enter the number of minutes the lasagna has been baking: ");
        int minutes = input.nextInt();

        int prepTime = layers * 2;
        int totalTime = prepTime + minutes;

        System.out.println(totalTime);

        input.close();
    }
}
