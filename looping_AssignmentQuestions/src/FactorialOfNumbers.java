import java.util.Scanner;

public class FactorialOfNumbers {

    /*
    Write a program in Java to compute and display factorial of numbers up to a
    number entered via the Scanner class. The output should look like as shown
    below when 7 is input. Example
         Enter a number:7
         1! (=1)= 1
         2! (=1x2)= 2
         3! (=1x2x3)= 6
         4! (=1x2x3x4)= 24
         5! (=1x2x3x4x5)= 120
         6! (=1x2x3x4x5x6)= 720
         7! (=1x2x3x4x5x6x7)= 5040
     */

    // Method to compute the factorial of a number
    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to display the factorial with detailed multiplication sequence
    public static void displayFactorials(int num) {
        for (int i = 1; i <= num; i++) {
            int fact = factorial(i);
            // Construct the multiplication sequence string
            StringBuilder sequence = new StringBuilder("1");
            for (int j = 2; j <= i; j++) {
                sequence.append("x").append(j);
            }
            System.out.printf("%d! (= %s) = %d%n", i, sequence.toString(), fact);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Display factorials up to the entered number
        displayFactorials(num);

        sc.close();
    }
}
