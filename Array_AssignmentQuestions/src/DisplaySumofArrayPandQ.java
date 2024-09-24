import java.util.Scanner;
public class DisplaySumofArrayPandQ {
    /*
    Write a program to store 6 elements in an array P, and 4 elements in an array Q and produce a
    third array R, containing all elements of array P and Q. Display the resultant array.

    INPUT             OUTPUT
    P[]   Q[]           R[]
    4     19            4
    6     23            6
    1     7             1
    2     8             2
    3                   3
    10                  10
                        19
                        23
                        7
                        8
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of input of first array: ");
        int num1 = sc.nextInt();
        int arr1[] = new int[num1];

        System.out.println("Enter the elements for the array P[]");
        for(int i = 0; i < num1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of input of second array: ");
        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];

        System.out.println("Enter the elements for the array Q[]");
        for(int i = 0; i < num2; i++){
            arr2[i] = sc.nextInt();
        }

        int sum = num1 + num2;
        int []sumArr = new int[sum];
        for(int i = 0; i < num1; i++){
            sumArr[i] = arr1[i];
        }

        for(int i = 0; i < num2; i++){
            sumArr[num1+i] = arr2[i];
        }

        System.out.println("Resultant array R[]");
        for(int i = 0; i < sum; i++){
            System.out.println(sumArr[i]);
        }

        /*
         // Display the arrays in columns
        System.out.printf("%-10s %-10s %-10s%n", "P[]", "Q[]", "R[]");
        int maxRows = Math.max(num1, num2);  // Determine the maximum number of rows needed

        for (int i = 0; i < maxRows; i++) {
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
            if (i < (num1 + num2)) {
                System.out.printf("%-10d%n", sumArr[i]);
            }
        }

         */
sc.close();

    }
}
