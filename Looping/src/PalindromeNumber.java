import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class PalindromeNumber {
    /*
    Write a program to accept a number and check whether the number is a
    Palindrome or not.
    HINT: A palindrome number is a number that remains the same when its
    digits are reversed. For example, 18381.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt(); //121
        int rev=0;
        int OriginalNum = num;
        while(num>0){
            int digit = num%10; //1
            rev = rev *10+ digit; //1
            num = num/10;
        }
        if(OriginalNum == rev){
            System.out.println(OriginalNum +" is a Palindrome number");
        }else
            System.out.println(OriginalNum+" is not a Palindrome number");
    }
}
