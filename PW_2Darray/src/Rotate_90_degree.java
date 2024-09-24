import java.util.Scanner;
public class Rotate_90_degree {

    static void printArray(int [][]arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void TransposeInPlace(int [][]arr, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = i; j < c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseArray(int []matrix){
        int i = 0, j = matrix.length-1;
        while(i < j){
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int [][]matrix, int n){
        //transpose
        TransposeInPlace(matrix, n, n);

        for(int i = 0; i < n; i++){
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int r = sc.nextInt();
        System.out.println("Enter the columns :");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        System.out.println("Enter the "+(r*c)+" number :");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array :");
        printArray(arr);

        System.out.println("Rotated array by 90 degree");
        rotate(arr, r);
        printArray(arr);
    }
}
