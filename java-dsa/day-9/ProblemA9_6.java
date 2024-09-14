// Given a number N, print all the digits of the number in reverse order.

public class ProblemA9_6 {
    public static void main(String[] args) {
        // Inputs
        int N = 12345;

        // Logic
        while (N > 0) {
            // Extract the last digit
            System.out.println(N % 10);
            // Shorten the number by removing the last digit
            N /= 10;
        }
    }
}
