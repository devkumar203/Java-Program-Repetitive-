import java.util.Scanner;
public class ArrayInit2D {
    public static void main(String[] args){
        /*
        1234
        1359
        2468
         */
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the column: ");
        int c = sc.nextInt();

        System.out.println("Enter "+(r*c)+" number :");
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
