/*
Given temperate of a person, analyse the situation of person and give him advice. Situtations and advice related with temperature are:
1. temp is in range of [85.0 to 91.0] then advice is "Serious Hypothermia".
2. temp is in range of (91.0 to 95.0) then advice is "Mild Hypothermia".
3. temp is in range of [95.0 to 98.0] then advice is "Normal Temperature".
4. temp if in range of (98.0 to 100.0] then advice is "Mild Fever'.
5. temp if in range of (100.0 to 105.0] then advice is "High Fever".
*/

import java.util.Scanner; // Input

public class ProblemA7_6 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        // Check the situation of temperature
        if (temp >= 85.0 && temp <= 91.0) {
            System.out.println("Serious Hypothermia");
        } else if (temp > 91.0 && temp < 95.0) {
            System.out.println("Mild Hypothermia");
        } else if (temp >= 95.0 && temp <= 98.0) {
            System.out.println("Normal Temperature");
        } else if (temp > 98.0 && temp <= 100.0) {
            System.out.println("Mild Fever");
        } else if (temp > 100.0 && temp <= 105.0) {
            System.out.println("High Fever");
        } else {
            System.out.println("Invalid Temperature");
        }

        sc.close();
    }
}
