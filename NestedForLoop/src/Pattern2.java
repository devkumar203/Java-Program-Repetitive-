import java.util.Scanner;
public class Pattern2 {
    /*
    Write a program to display the following pattern
    @ @ @ @ @ @ @ 7
    @ @ @ @ @ @ 6
    @ @ @ @ @ 5
    @ @ @ @ 4
    @ @ @ 3
    @ @ 2
    @ 1
    0
     */
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
      int numofRows = sc.nextInt();  //5
      for(int i = 1; i <=numofRows; i++){
          for(int j = numofRows; j >= i; j--){
              if(j==i){
                  System.out.print((numofRows-i)+" ");
              }else
                  System.out.print("@ ");
          }
          System.out.println();
      }
    }
}
