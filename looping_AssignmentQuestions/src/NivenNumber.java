import java.util.Scanner;
public class NivenNumber {
    /*
    Write a program to accept a number and check and display whether it is a Niven
    number or not.(Niven number is a number which is divisible by the sum of its digits).
    Example: Consider the number 126.
             Sum of its digits is 1+2+6 and 126 is divisible ny 9.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        int originalNum = num;
        while (num>0){
            int digit = num%10;
            sum = sum+digit;
            num = num/10;
        }
        if(originalNum %sum ==0){
            System.out.println(originalNum+" is Niven Number");
        }else
            System.out.println(originalNum+" is not a Niven Number");
    }
}
