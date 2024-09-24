import java.util.Scanner;
public class SpyNumber {
    /*
    Write a program to accept a number and check and display whether it is
    a spy number or not.(A number is called a spy number if the sum of its
    digits equal the product of the digits.)
    Example:
    Consider the number 1124
    Sum of the digits = 1+1+2+4=8
    Product of the digits = 1*1*2*4 = 8.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int num = sc.nextInt();
        int sum = 0, product = 1;
        int originalNum = num;
        while(num >0){
            int digits = num%10;
            sum = sum+digits;
            product = product*digits;
            num =num/10;
        }
        if(sum == product){
            System.out.println(originalNum+" is a Spy number");
        }else
            System.out.println(originalNum+" is not a Spy number");

        sc.close();
    }
}
