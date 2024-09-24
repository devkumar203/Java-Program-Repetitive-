import java.util.Scanner;
public class MatrixSum {

    static void printArray(int [][]arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void sum(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("You Entered the wrong number, Addition not possible!");
            return;
        }

        int[][] add  = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                add[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of Matrix1 and Matrix2 is :");
        printArray(add);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the columns: ");
        int c1 = sc.nextInt();
        int [][] arr1 = new int[r1][c1];

        System.out.println("Enter the "+(r1*c1)+" number :");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the rows: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the columns: ");
        int c2 = sc.nextInt();
        int [][] arr2 = new int[r2][c2];

        System.out.println("Enter the "+(r2*c2)+" number");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array1:");
        printArray(arr1);

        System.out.println("Original Array2:");
        printArray(arr2);

        sum(arr1, r1, c1, arr2, r2, c2);
    }
}
