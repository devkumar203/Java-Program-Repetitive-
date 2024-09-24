import jdk.swing.interop.SwingInterOpUtils;

import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;
public class BuzzNum_GCD {
    /*
    Write a menu driven program to accept a number from the user and check whether
    it is a BUZZ number or to accept any two numbers and to print the GCD of them
      i. A BUZZ number is the number which either ends with 7 or is divisible by 7.

      ii.GCD(Greatest Common Divisor) of two integers is calculated by continued
         division method. Divide the larger number by the smaller; the remainder
         then divides the previous divisor. The process is repeated till the
         remainder is zero. The divisor then results the GCD.
     */

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the choice!");
         int choice = sc.nextInt();
         int num;

         switch (choice){
             case 1:
                 //ends with 7 and divisible by 7
                 System.out.println("Enter the number: ");
                 num = sc.nextInt();

                 if(num%10==7  && num%7==0){
                     System.out.println(num+" is a Buzz number.");
                 }else{
                     System.out.println(num+" is not a Buzz number.");
                 }
                 break;

             case 2:
                 //GCD, 68, 16 -->4
                 System.out.println("Enter the first number: ");
                 int num1 = sc.nextInt();
                 System.out.println("Enter the second number: ");
                 int num2 = sc.nextInt();

                 System.out.println("The greatest number is :"+GCD(num1, num2));
                 break;

             default:
                 System.out.println("Invalid choice!");

         }
     }
    static int GCD(int num1, int num2){
        while (num1 != num2){
            if(num1>num2){
                num1 = num1-num2;
            }else
                num2 = num2-num1;
        }
        return num1;
    }
}
