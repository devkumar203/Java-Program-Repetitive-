import java.util.Scanner;
public class ComputePower {
    /*
    Write a java program that reads two positive integer numbers(a and b)
    and calculates a^b using only addition and multiplication operations.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int counter=1;
        int product = 1;

        while(counter <= b){
            product *= a;

            counter++;
        }
        System.out.println(a + "^"+ b+ "="+product);
//        System.out.println("The result is : "+(int)Math.pow(a,b));

    }
}
