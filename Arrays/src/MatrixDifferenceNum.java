import java.util.Scanner;
public class MatrixDifferenceNum {
    /*
    If arrays M and M+N are as shown below, write a program in java to find the
    array N.
                     -1  0  2              -6  9  4
                 M = -3 -1  6  and M + N =  4  5  0
                      4  3 -1               1 -2 -3
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int matrixM[][] = new int[size][size];
        int matrixN[][] = new int[size][size];
        System.out.println("Enter the "+(size*size)+ " number of matrix M");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrixM[i][j] = sc.nextInt();
            }
        }

        int matrixMN[][] = new int[size][size];

        System.out.println("Enter the "+(size*size)+" number of Matrix MN: ");
        for(int i = 0; i < size; i++){
            for(int j = 0 ; j < size; j++){
                matrixMN[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < size; i++){
            for(int j = 0 ; j < size; j++){
                System.out.print(matrixM[i][j]+"\t");
            }

            System.out.print("+\t");

            for(int j = 0; j < size; j++){
                System.out.print(matrixMN[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrixN[i][j] = matrixMN[i][j] - matrixM[i][j];
            }
        }

        System.out.println("Sum of A and B Matrix : ");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(matrixN[i][j]+"\t");
            }
            System.out.println();
        }

/*
-1
0
2
-3
-1
6
4
3
-1
 */
        /*
        -6
9
4
4
5
0
1
-2
-3
         */
    }
}
