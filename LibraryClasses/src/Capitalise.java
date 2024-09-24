import java.util.Scanner;
public class Capitalise {
    /*
    Write a program in java to accept a string in lowercase and change the first letter
    of every word to uppercase Display the new String:

    Sample INPUT: we are in cyber world
    Sample OUTPUT: We Are In Cyber World
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();

        String output = "";
        for(int i = 0; i< input.length(); i++){

            char currentChar = input.charAt(i);
            if(i == 0 || input.charAt(i-1) ==' ')
                output = output + Character.toUpperCase(currentChar);
            else
                output = output + currentChar;
        }

        System.out.println("New string is : "+ output);
        sc.close();

    }
}
