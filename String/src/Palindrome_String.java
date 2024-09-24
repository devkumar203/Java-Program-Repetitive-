import java.util.Scanner;
public class Palindrome_String {
    public static void main(String[] args){
        /*
        Write a program to accept a word and check if it is a Palindrome or not.
        (Hint: A Palindrome is a word which reads the same backward as forward)
        Sample Input:
        Radar
        Sample Output:
        Radar is Palindrome
         */
        Scanner sc = new Scanner(System.in);
        int length;
        String reverseString = "";
        System.out.println("Enter the word(for the palindrome):");
        String s = sc.nextLine();
        length = s.length();

        for(int i = length-1; i >=0; i--){
            reverseString = reverseString + s.charAt(i);
        }
        if(reverseString.equalsIgnoreCase(s)){
            System.out.println(s+" is a palindrome number: ");
        }else
            System.out.println(s+" is not a palindrome number: ");
    }
}
