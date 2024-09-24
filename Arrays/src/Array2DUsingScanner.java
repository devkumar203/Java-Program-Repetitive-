import java.util.Scanner;
public class Array2DUsingScanner {
    public static void main(String[] args){
        System.out.println("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter number of column: ");
        int c = sc.nextInt();
        int matrix[][]  = new int[r][c];

        int totnum = r*c;
        System.out.println("Enter the "+totnum+" no. : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
