import java.util.Scanner;
public class DisplaylongNumber {
    /*
    Write a program that reads a long number, counts and displays the occurrences
    of each digit in it.
     */

        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Prompt user to enter a long number
            System.out.print("Enter a long number: ");
            String numberStr = scanner.nextLine();

            // Initialize an array to count occurrences of each digit (0-9)
            int[] digitCount = new int[10];

            // Count occurrences of each digit
            for (char c : numberStr.toCharArray()) {
                if (Character.isDigit(c)) { // Check if the character is a digit
                    int digit = c - '0'; // Convert character to integer digit
                    digitCount[digit]++;
                }
            }

            // Display the occurrences of each digit
            System.out.println("Digit occurrences:");
            for (int i = 0; i < digitCount.length; i++) {
                System.out.println(i + ": " + digitCount[i]);
            }

            // Close the scanner
            scanner.close();
        }
    }


