import java.util.Scanner;

public class SumProduct {
    /*
    Write a program to input some positive and negative numbers and compute the sum
    of positive numbers and the product of negative numbers. The program should exit
    when a 0(Zero) is entered.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0, num;
        int product =1;
        do {
        System.out.println("Enter the positive number: ");
         num = sc.nextInt();
            if (num > 0) {
                sum = sum + num;
            } else if(num < 0){
                product = product * num;
            }
        }while (num !=0);

        System.out.println("Sum of Positive number: "+ sum);
        System.out.println("Product of Negative number: "+ product);
    }

}
