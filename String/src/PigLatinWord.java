import java.util.Scanner;
public class PigLatinWord {
    /*
    Write a program that encodes a word in PigLatin. To translate a word into PigLatin
    word, convert the word into uppercase and then place the first vowel of the original
    word as a start of the new word along with the remaining alphabets. The alphabets
    present before the vowel being shifted towards the end followed by "AY".
    Sample Input: London      Sample Output: ONDONLAY
    Sample Input: Olympics    Sample Output: OLYMPICSAY
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length;
        String pigLitinWord = "", preVowelWord = "", postVowelWord = "";
        System.out.println("");
        char tempChar;
        int posVowel = -1;

        System.out.println("Enter a string:");
        String inpuString = sc.nextLine();

        inpuString = inpuString.toUpperCase();

        length = inpuString.length();

        for(int i = 0;i < length; i++){
            tempChar = inpuString.charAt(i);

            if(tempChar == 'A' || tempChar == 'E' || tempChar == 'I'
            ||tempChar =='O' || tempChar == 'U'){
                posVowel = i;
                System.out.println("Position: "+ posVowel);
                break;
            }
        }

        if(posVowel >= 0){
            preVowelWord = inpuString.substring(0, posVowel);
            postVowelWord = inpuString.substring(posVowel);
            pigLitinWord = postVowelWord + preVowelWord + "AY";
            System.out.println("PigLatin of "+ inpuString+" is "+pigLitinWord);
        }
        else
            System.out.println("No vowels found");

        sc.close();
    }
}
