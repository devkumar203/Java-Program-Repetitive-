import java.util.Scanner;
public class RectangularPatternPart2 {
    /*
    Write a program to display the following pattern.
    * * * * * * 1
    * * * * * 2 *
    * * * * 3 * *
    * * * 4 * * *
    * * 5 * * * *
    * 6 * * * * *
    7 * * * * * *
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows: ");
        int numRows = input.nextInt();

        for(int i = 1; i<=numRows; i++){
            for(int j = i; j<=numRows; j++){
                if(j == numRows){
                    System.out.print(i+" ");
                }else
                    System.out.print("* ");
            }

            for(int k = 1; k < i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
