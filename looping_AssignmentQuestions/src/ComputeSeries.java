import java.util.Scanner;
public class ComputeSeries {
    /*
    Write a program to read the number x using the Scanner class and compute the series:
    Sum = x/2+x/5+x/8+x/11+...+x/20
    The output should look like as show below:
           Enter the value x: 10
           Sum of the series is: 10.961611917494269
     */

    public static double sum(double x){
        double Sum = 0;
        for(int i = 2; i<=20; i+=3){
            Sum = Sum+ (x/i);
        }
        return Sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        double x = sc.nextDouble();

        System.out.printf("Sum of the series is:%.15f%n",sum(x));
        //The %.15f ensures that the number is displayed with 15 decimal places.
        //The %n adds a newline after the output, ensuring any subsequent output
        // starts on a new line.
    }

}
