import java.util.Scanner;
public class SumSeries {
    /*
    Write a program to calculate and print the sum of each of the following series:
    i) Sum(S) = 2-4+6-8+........-20
    ii)Sum(S) = x/2 + x/5 +x/8+.......+x/20
        (Value of x to be input by the user)
     */
    public static void SumSeriesOne() {
        int sum = 0;
        for (int i = 2; i <= 20; i = i + 2) {

            if (i % 4 == 0) {
                System.out.print("-" + i + " ");
                sum = sum - i;
            }
             else {
                System.out.print("+" + i + " ");
                sum = sum + i;
            }
        }
        System.out.println("\nSum of Series1: "+sum);
    }

    public static void SumSeriesTwo(double x){
        double sum = 0;
        for(int i = 2; i <=20; i = i+3){
            System.out.print("+"+x+"/"+i+" ");
            sum = sum + (x/i);
        }
        System.out.println("\nsum of  Series2: "+sum);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        SumSeriesOne();
        SumSeriesTwo(x);
    }
}