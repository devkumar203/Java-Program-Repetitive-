import java.util.Scanner;
public class MenuDrivenUsingSwitch {
    /*
    Using the switch statement, write a menu driven program to:
      i. Generate and display the first 10 terms of the Fibonacci series 0, 1, 1, 2, 3, 5
         The first two Fibonacci numbers are 0 and 1, and each subsequent number is the
         sum of the previous two.

      ii.Find the sum of the digits of an integer that is input.
         Sample Input: 15390
         Sample Output: Sum of the digits = 18

      For an incorrect choice, an appropriate error message should be displayed.
     */

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice(1 or 2): ");
        int choice = sc.nextInt();
        int sum = 0;
        int num;
        switch (choice){

            case 1:
                System.out.println("Enter the number: ");
                num = sc.nextInt();
               int a =0, b = 1;
                System.out.print(a+" "+b+" ");
                for(int i = 0; i <=num; i++){
                    sum = a+b;
                    System.out.print(sum+" ");
                    sum = a+b;

                    a = b;
                    b = sum;
                }
                break;

            case 2:
                num = sc.nextInt();

                while(num>0){
                    int digit = num%10;
                    sum = sum+digit;
                    num = num/10;
                }
                System.out.println("Sum of the digits = "+sum);
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}
