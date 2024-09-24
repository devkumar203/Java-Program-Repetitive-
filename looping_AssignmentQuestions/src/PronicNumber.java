import java.util.Scanner;
public class PronicNumber {
    /*
    Write a program to input a number and check and print whether it is a
    Pronic number or not.(Pronic number is a number which is the product of two
    consecutive integers.)
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();   //12, 20
        boolean isPronic = false;
        for(int i = 3; i*(i+1) <=num; i++) {

            if (i * (i + 1) == num){
                isPronic = true;
                break;
            }
        }
        if(isPronic){
            System.out.println(num+" is a Pronic Number.");
        }else
            System.out.println(num+" is not a Pronic Number.");
    }

}
