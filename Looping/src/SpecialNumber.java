import java.util.Scanner;
public class SpecialNumber {
    /*
    Write a program to input a number and print whether the number is a special
    number or not(A number is said to be a special number, if the sum of the factorial
    of the digits of thee number is same as the original number).
    For example, 145 is a special number because 1!+4!+5! = 1+24+120=145.
    Similarly, 40585 is special number because 4!+0!+5!+8!+5! =24+1+120+40320+120
                                                              =40585
     */
   //Compute Factorial
    public static long factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    //Compute sum of Factorial
    public static long SumOfFactorial(int num){
        long sumOfDigits = 0;
        while(num >0){
            int digit = num%10;
            sumOfDigits = sumOfDigits + factorial(digit);
            num = num/10;
        }
        return sumOfDigits;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        long sum = SumOfFactorial(num);

        //comparing the sum and number for checking Special number.
        if(sum == num){
            System.out.println(num+ " is a Special Number: ");
        }else{
            System.out.println(num +" is Not a Special number");
        }
    }
}
