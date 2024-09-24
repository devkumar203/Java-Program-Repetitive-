import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = num; i > 0; i--){
            for(int j = 0; j < num-i; j++){
                System.out.print(" ");
            }

            for(int k = 0; k < ( 2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
