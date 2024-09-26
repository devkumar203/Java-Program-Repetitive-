import java.util.Scanner;
public class pyramid_numbering {
    public static void main(String[] args){

        for(int i = 0; i <= 5; i++){
            for(int j = 5; j >=i; j--){
                System.out.print("  ");
            }

            for(int k = i+1; k > 1; k--){
                System.out.print(k-1+" ");
            }

            for(int l = 2; l <= i; l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
