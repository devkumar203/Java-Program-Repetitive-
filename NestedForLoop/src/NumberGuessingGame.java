import java.util.Scanner;
public class NumberGuessingGame {
    /*
    Write a program called NumberGuessingGame to play a number guessing game. The program
    shall generate a random number between 1 and 100. The player inputs his/her guess, and
    the program shall response with "Try a higher number", "Try a lower number" or
    "You guessed it in n tries!" accordingly. Also display the random number in the end.
     */

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int secretNumber = (int)(100 * Math.random()+1);
        int guessNumber, count = 0;

        System.out.println("Please guess the number ( enter 0 to exit): ");
        guessNumber = sc.nextInt();

        while ((guessNumber != secretNumber) && (guessNumber !=0))
        {
            if(guessNumber > secretNumber){
                System.out.println("Try a lower number");
            }else if(guessNumber < secretNumber){
                System.out.println("Try a higher number");
            }else
                break;

            count++;
            guessNumber = sc.nextInt();
        }

        if(guessNumber == 0){
            System.out.println("You tried "+ count+" times!");
            System.out.println("The secret number was "+ secretNumber);
        }
        else{
            System.out.println("You guessed it in "+ count+" tries");
            System.out.println("Yes! The secret nmber is "+ secretNumber);
        }

        sc.close();
    }
}
