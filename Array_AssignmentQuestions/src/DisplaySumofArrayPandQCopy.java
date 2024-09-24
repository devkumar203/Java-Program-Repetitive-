import java.util.Scanner;
public class DisplaySumofArrayPandQCopy {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first array
        System.out.println("Enter the number of elements for the first array (P): ");
        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];

        System.out.println("Enter the elements for the first array (P): ");
        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for the second array
        System.out.println("Enter the number of elements for the second array (Q): ");
        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];

        System.out.println("Enter the elements for the second array (Q): ");
        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Create the resultant array
        int[] sumArr = new int[num1 + num2];

        // Copy elements of arr1 into sumArr
        for (int i = 0; i < num1; i++) {
            sumArr[i] = arr1[i];
        }

        // Copy elements of arr2 into sumArr
        for (int i = 0; i < num2; i++) {
            sumArr[num1 + i] = arr2[i];
        }

        // Display the arrays side by side
        System.out.printf("%-10s %-10s %-10s%n", "P[]", "Q[]", "R[]");

        int maxRows = Math.max(num1, num2);  // Determine the maximum number of rows needed

        for (int i = 0; i < sumArr.length; i++) {
            // Print elements of arr1 (P[])
            if (i < num1) {
                System.out.printf("%-10d", arr1[i]);
            } else {
                System.out.printf("%-10s", ""); // Empty space if no element
            }

            // Print elements of arr2 (Q[])
            if (i < num2) {
                System.out.printf("%-10d", arr2[i]);
            } else {
                System.out.printf("%-10s", ""); // Empty space if no element
            }

            // Print elements of sumArr (R[])
            System.out.printf("%-10d%n", sumArr[i]);
        }

        sc.close();
    }
    }


