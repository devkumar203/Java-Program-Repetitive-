import java.util.Scanner;
public class PrimeNumberWithBreak {
    /*
    Write a program to check whether the given number is a prime number or not.
    While doing so, demonstrate the use of the break statement in java.
     */

    //My own logic----->
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for (int i = 2; i <=num-1; i++){
            if(num % i ==0){
                System.out.println(num+" is not a Prime number");
                break;
            }else
                System.out.println(num+" is a prime number");
                break;
        }
    }
}
