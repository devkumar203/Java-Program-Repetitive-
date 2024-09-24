import java.util.Scanner;
public class SumOfSeriesWithFactorails {
    //Write a program to read the number n using the Scanner class and compute the
    //series:  1/1!+2/2!+3/3!+4/4!+.....n/n!



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i = 1;
        double sum = 0;
        while(i <= num){
            sum = sum+ (double)i/(Factorial(i));
            i++;
        }
        System.out.println("Sum of series is: "+sum);
    }

    //Sum of Factorial
    public static long Factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact *i;
        }
        return fact;
    }
}
