import java.util.Scanner;
public class SpyNumber {
    /*
    Write a program to check whether a number is a Spy number or not.
    HINT: A number is said to be a Spy number if the sum of all
    the digits is equal to the product of all the digits.
    For example, 1124 is a Spy number. The sum of its digits
    (1+1+2+4=8) is the same as product of its digits(1*1*2*4=8)
     */
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, product = 1;
        int OriginalNum = num;
        while(num >0){
            int digit = num%10;
            sum = sum + digit;
            product = product * digit;
            num = num/10;
        }

        if(sum == product){
            System.out.println(OriginalNum+ " is a Spy Number");
        }else
            System.out.println(OriginalNum+" is not a Spy Number");
    }
}

