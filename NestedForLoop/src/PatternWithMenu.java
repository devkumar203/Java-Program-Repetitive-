import java.util.Map;
import java.util.Scanner;
public class PatternWithMenu {
    /*
    Write a program to display the following menu:
      Pattern Menu
      ============
      1. Triangle
      2. Inverted Triangle
      3. Exit
      Enter your choice
     Let the user select an option. For option 1 and 2, accept the number of rows to
     be printed using the Scanner class.
     */
    public static void main(String[] args){
        int numRows;
        Scanner sc = new Scanner(System.in);

            System.out.println("Pattern Menu");
            System.out.println("=============");
            System.out.println("1. Triangle");
            System.out.println("2. Inverted Triangle");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter number of rows: ");
                    numRows = sc.nextInt();
                    for (int i = 1; i <= numRows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("@ ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Please enter number of rows: ");
                    numRows = sc.nextInt();
                    for (int i = 1; i <= numRows; i++) {
                        for (int j = numRows; j >= i; j--) {
                            System.out.print("@ ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

    }

}
