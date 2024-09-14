// FizzBuzz

import java.util.Scanner; // For taking input from the user

public class ProblemA8_5 {
    // Making a dictionary for expandable FizzBuzz
    public static String[][] dict = { { "3", "Fizz" }, { "5", "Buzz" } };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // Loop for printing the numbers
        for (int i = 1; i <= x; i++) {
            String output = "";

            // Loop for checking the divisibility
            for (int j = 0; j < dict.length; j++) {
                if (i % Integer.parseInt(dict[j][0]) == 0) {
                    output += dict[j][1];
                }
            }

            if (output.equals("")) {
                output += i;
            }
            System.out.println(output);
        }

        sc.close();
    }
}
