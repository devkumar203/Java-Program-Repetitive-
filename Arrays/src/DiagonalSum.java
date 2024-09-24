import java.util.Scanner;
public class DiagonalSum {
    /*
    Write a program in java to input a two-dimensional array of size n(rows = columns = n) and perform
    the following tasks:
      i) Print the array in matrix form(n x n)
     ii) Compute and print the sum of the elements at the left diagonal.
    iii) Compute and print the sum of the elements at the right diagonal.

    A 4 x 4 matrix(size = 4) takes the following form:

    the left diagonal elements are present at location where row index = column index, i.e.,
    [0][0], [1][1], [2][2], and [3][3].
    the right diagonal elements are present at location where row index + column index = size of array-1,
    i,e., 0+3 = 1+2 = 2+1 = 3+0 = 4-1 = 3.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leftDiagonalSum = 0, rightDiagonalSum = 0;
        System.out.println("Enter the size:");
        int size = sc.nextInt();


        int arr2D[][] = new int[size][size];

        System.out.println("Enter the " + (size * size) + " number :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

//              i) Print the array in matrix form(n x n)
                System.out.print(arr2D[i][j] + "\t");

//             ii) Compute and print the sum of the elements at the left diagonal.
                if (i == j) {
                    leftDiagonalSum = leftDiagonalSum + arr2D[i][j];
                }

//            iii) Compute and print the sum of the elements at the right diagonal.
                if((i+j) == (size - 1)){
                    rightDiagonalSum = rightDiagonalSum + arr2D[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum of left diagonal elements : " + leftDiagonalSum);
        System.out.println("Sum of right diagonal elements : "+ rightDiagonalSum);

    }
}
