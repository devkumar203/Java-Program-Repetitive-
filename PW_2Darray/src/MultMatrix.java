import java.util.Scanner;
public class MultMatrix {

    static void printArray(int [][] arr1){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void matrixMult(int [][]arr1, int r1, int c1, int [][]arr2, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("You Entered Wrong number, Invalid number:");
            return;
        }

        int mul[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Multiplication of matrix:");
        printArray(mul);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the columns: ");
        int c1 = sc.nextInt();
        int [][]arr1 = new int[r1][c1];

        System.out.println("Enter the "+(r1*c1)+" number");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the rows: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the columns: ");
        int c2 = sc.nextInt();
        int [][]arr2 = new int[r2][c2];

        System.out.println("Enter the "+(r2*c2)+" number:");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array1: ");
        printArray(arr1);
        System.out.println("Original Array2: ");
        printArray(arr2);

        matrixMult(arr1, r1, c1, arr2, r2, c2);

    }
}
