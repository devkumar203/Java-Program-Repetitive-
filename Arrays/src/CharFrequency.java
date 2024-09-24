import java.util.Locale;
import java.util.Scanner;
public class CharFrequency {
    /*
    Write a program to input a string in uppercase and print the frequency of each
    character.
    INPUT     :      COMPUTER HARDWARE
    OUTPUT    :
    CHARACTERS       FREQUENCY

    A                2
    C                1
    D                1
    E                2
    H                1
    M                1
    O                1
    P                1
    R                3
    T                1
    U                1
    W                1
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Declare an array to store frequency of each letter
        int charFrequency[] = new int[26];

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        //Ensure it is in uppercase
        input = input.toUpperCase();

        for(int i = 0; i < input.length(); i++){
            //Extract the char at ith position
            char ch = input.charAt(i);
            //Ensure it is a letter
            if(Character.isLetter(ch))
                charFrequency[ch - 'A']++;
        }

        System.out.println("Characters Frequency");
        for(int i = 0; i < 26; i++){
            //Display non-zero frequency only
            if(charFrequency[i] != 0){
                //Display the character with its frequency
                System.out.println((char) (i + 'A') + "\t\t" + charFrequency[i]);
            }
        }
        sc.close();
    }
}
