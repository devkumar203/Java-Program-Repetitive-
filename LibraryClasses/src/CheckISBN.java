import java.util.Scanner;
public class CheckISBN {
    /*
    The international Standard Book Number(ISBN) is a unique numeric book identifier which is printed
    on every book. The ISBN is based upon a 10-digit code. The ISBN is legal if:

    1xdigit1 + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 8xdigit8 + 9xdigit9
    + 10xdigit10 is divisible by 11.
    Example: For an ISBN 1401601499

    Sum = 1x1 + 2x4 + 3x0 + 4x1 + 5x6 + 6x0 + 7x1 + 8x4 + 9x9 + 10x9 = 253 which is divisible by 11.

    Write a program to:
    i. input the ISBN code as a 10-digit integer.
    ii. If the ISBN is not a 10-digit integer, output the message 'Illegal ISBN' and terminate the
        program.
   iii. If the number is 10-digit, extract the digits of the number and compute the sum as explained
        above.

  If the sum is divisible by 11, out the message, "Legal ISBN". If the sum is not divisible by 11,
  output the message, "Illegal ISBN".
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sumOfDigits = 0;
        System.out.println("Enter ISBN code: ");
        long input = sc.nextLong();

        String isbnNumber = input +"";
        if(isbnNumber.length() != 10){
            System.out.println("Illegal ISBN number");
            System.exit(0);
        }

       for(int i = 1; i <=10; i++){
           String stringDigit = isbnNumber.charAt(i-1)+"";
           int numberDigit = Integer.parseInt(stringDigit);
           sumOfDigits = sumOfDigits +((i)*numberDigit);
       }

       if(sumOfDigits % 11 ==0)
           System.out.println("LEGAL ISBN");
       else
           System.out.println("Illegal ISBN");
       sc.close();
    }
}
