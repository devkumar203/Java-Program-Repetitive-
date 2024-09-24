import java.util.Scanner;
public class BuzzNumber {
    public static void main(String[] args){
        /*
        Write a program in java to determine if an entered number is a Buzz number.
        HINT: A number is said to be a Buzz number if it ends with 7 or is divisible by 7.
        Examples: 1007 is a Buzz number as it ends with 7; 343 is also a Buzz Number as it is
                  divisible by 7; but 978 is not a buzz number as it is not divisible by 7.
         */

            System.out.println("Enter the number to check weather it is Buzz number or not: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num % 7 == 0 || num % 10 == 7) {
                System.out.println(num + " is a Buzz number.");
            } else
                System.out.println(num + " is not a Buzz number.");
    }
}
