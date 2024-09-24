import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        /*
        Create a Menu driven program to perform the following operation:
        1. Addition
        2. Subtraction
        3. Multiplication
        4. Division
        5. Remainder
        6. Exit
         After making a selection the program should as the user to input two numbers and perform the
         requested operation. An appropriate message should be displayed for and invalid choice.
         */
        double num1, num2, result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("6. Exit");

        System.out.println("Enter the choice: ");
        int ch;
        do {
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    num1 = AcceptInput(1);
                    num2 = AcceptInput(2);
                    result = num1 + num2;
                }
                case 2 -> {
                    num1 = AcceptInput(1);
                    num2 = AcceptInput(2);
                    result = num1 - num2;
                }
                case 3 -> {
                    num1 = AcceptInput(1);
                    num2 = AcceptInput(2);
                    result = num1 * num2;
                }
                case 4 -> {
                    num1 = AcceptInput(1);
                    num2 = AcceptInput(2);
                    result = num1 / num2;
                }
                case 5 -> {
                    num1 = AcceptInput(1);
                    num2 = AcceptInput(2);
                    result = num1 % num2;
                }
                case 6 -> {
                    System.out.println("Thanks for using the Calculator!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("***Invalid option entered***");
                    System.exit(0);
                }
            }

            System.out.println("Result is :" + result);
            System.out.println("Do you want to perform another calculation? Press 0 to exit, any other" +
                    "number to continue: ");
            ch = sc.nextInt();
        }while (ch != 0);
    }

    public static double AcceptInput(int n){
        System.out.println("Enter the number "+n+": ");
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }


}
