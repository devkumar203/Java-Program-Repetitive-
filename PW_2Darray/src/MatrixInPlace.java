import java.util.Scanner;
public class MatrixInPlace {

    static void printArr(int [][]arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static void TransposeInplace(int [][]arr, int r, int c){

        for(int i = 0; i < r; i++){
            for(int j = i; j < c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int r = sc.nextInt();
        System.out.println("Enter the columns:");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        System.out.println("Enter the "+(r*c)+" numbers:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array:");
        printArr(arr);
        TransposeInplace(arr, r, c);
        System.out.println("Transposed Array:");
        printArr(arr);
    }
}
