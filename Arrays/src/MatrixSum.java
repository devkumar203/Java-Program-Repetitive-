import java.util.Scanner;
public class MatrixSum {
    /*
    Write a program in java that computes the sum of two 3 x 3 matrices and displays
    their sum.
    HINT: For two 3 x 3 matrices, their sum is computed as:

     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Matrix A: ");
        int size = sc.nextInt();
        int MatrixA[][] = new int[size][size];
        int MatrixC[][] = new int[size][size];
        System.out.println("Enter the "+(size*size)+" of Matrix A");
        for(int i = 0; i < size; i++){
            for(int j = 0 ; j < size; j++){
                MatrixA[i][j] = sc.nextInt();
            }
        }


        int MatrixB[][] = new int[size][size];

        System.out.println("Enter the "+(size*size)+" number of Matrix B: ");
        for(int i = 0; i < size; i++){
            for(int j = 0 ; j < size; j++){
                MatrixB[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < size; i++){
            for(int j = 0 ; j < size; j++){
                System.out.print(MatrixA[i][j]+"\t");
            }

                System.out.print("+\t");

            for(int j = 0; j < size; j++){
                System.out.print(MatrixB[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                MatrixC[i][j] = MatrixA[i][j] + MatrixB[i][j];
            }
        }

        System.out.println("Sum of A and B Matrix : ");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(MatrixC[i][j]+"\t");
            }
            System.out.println();
        }

    }


}
