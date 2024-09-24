import java.util.Scanner;
public class SumOfDigits {

    public static long summing(int num){
        int digit;
        int sum = 0;
        while(num>0){
            digit= num%10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num  = sc.nextInt();
        System.out.println("Sum of digits: "+summing(num));

    }
}
