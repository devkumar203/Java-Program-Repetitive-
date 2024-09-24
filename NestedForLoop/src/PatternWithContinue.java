import java.util.Scanner;
public class PatternWithContinue {
    /*
    Write a program to accept an input and display the following pattern:
    Please enter the value of n:8

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j ) {
                    System.out.print("\\ ");
                } else if (i + j == num-1) {
                    System.out.print("/ ");
                } else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }
}
