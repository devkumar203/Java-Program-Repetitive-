import java.util.Scanner;
public class NivenNumber {
    /*
    Write a program to check whether a number is a Niven number or not.
    HINT: Any positive integer which is divisible by the sum of its digits is a
    Niven number or Harshad number.
    For example: 111/(1+1+1) = 37
     */

     //156 = 1+5+6 = 12, 156%12==0

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int  num = sc.nextInt();
        int sum =0;

        int OriginalNum = num;
        while(num>0){
            int digit = num%10;
            sum = sum + digit;
            num =num/10;
        }
        if(OriginalNum %sum == 0){
            System.out.println(OriginalNum+ " is a Niven numer(Harshad Number)");
        }else{
            System.out.println(OriginalNum+ " is not a Niven number(Harshad Number)");
        }
    }
}
