import java.util.Scanner;
public class Transpose_Matrix {

    static void printArray(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] TransoseM(int arr[][], int r, int c){
        int ans[][] = new int[r][c];
        int n = arr.length;
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int r = sc.nextInt();
        System.out.println("Enter the columns:");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        System.out.println("Enter the "+(r*c)+" number :");
        for(int i = 0; i< r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array:");
        printArray(arr);
        int ans[][] = TransoseM(arr, r, c);
        System.out.println("Transposed Matrix");
        printArray(ans);


    }
}
