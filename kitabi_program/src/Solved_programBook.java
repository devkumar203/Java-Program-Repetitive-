import java.util.Scanner;
public class Solved_programBook {
    /*
    Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits.
    If the value is equal to the input number, display the message "Special 2-digit number"; otherwise display
    the message "Not a Special 2-digit number".
     */
    public static void main(String[] args){
        // a+b == c;
        // a*b == d;
        // if c == d then both num are special 2 digit number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two digit number: ");
        int num = sc.nextInt();  //56 = a%10 = 6; a/56 = 5

        if(num > 10 && num <100){
            System.out.println("You entered two digit number.");
            int firstPlace = num/10;
            int secondPlace = num%10;
            int sum = (firstPlace+secondPlace);
            int mult = (firstPlace*secondPlace);
            int newNumber = sum + mult;
            if(newNumber == num){
                System.out.println("Special 2-digit number.");
            }else{
                System.out.println("Not a special 2-digit number.");
            }
        }

    }
}
