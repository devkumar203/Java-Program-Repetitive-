import java.util.Scanner;
public class SumColumn {
    /*
    Write a program in java to input a two-dimensional array of size n x m(rows = n; columns = m) and
    perform the following tasks:
      i) Print the array in matrix form(n x m)
      ii)Compute and print the sum of elements of each column
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int columnSum = 0;
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        int arr2D[][] = new int[rows][columns];
        System.out.println("Enter the "+(rows*columns)+" numbers: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr2D[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0 ; i < columns; i++){
            columnSum = 0;
            for(int j = 0; j < rows; j++){
                columnSum = columnSum + arr2D[j][i];
            }
            System.out.println("Sum of columns with index "+ i + " is "+ columnSum);
        }
        sc.close();
    }
}
