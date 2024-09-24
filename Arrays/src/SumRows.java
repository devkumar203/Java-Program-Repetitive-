import java.util.Scanner;
public class SumRows {
    /*
    Write a program in java to input a two-dimensional array of nxm(rows = n; column = m) and perform the following tasks:
      i) Print the array in matrix form (n x m).
      ii)Compute and print the sum of elements of each row.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sumRow = 0;
        System.out.println("Enter number of rows: ");
        int rows= sc.nextInt();
        System.out.println("Enter number of columns: ");
        int column = sc.nextInt();
        int arr2D[][] = new int[rows][column];

        System.out.println("Enter "+(rows * column)+" number");
        for(int i = 0; i <rows; i++){
            for(int j = 0; j < column; j++){
                arr2D[i][j] = sc.nextInt();
            }
        }

        System.out.println("Displaying 2D array: ");
        for(int i = 0; i <rows; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0; i < rows; i++){
            sumRow = 0;
            for(int j = 0; j < column; j++){
                sumRow = sumRow + arr2D[i][j];
            }
            System.out.println("Sum of row with index "+i+" is "+ sumRow);
        }
        sc.close();
    }

}
