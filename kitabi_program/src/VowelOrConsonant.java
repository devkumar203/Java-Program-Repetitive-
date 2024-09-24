import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check weather it is vowel or not.");
        char ch = sc.next().charAt(0);  //a
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch<='z'))
            checkVowelorConsonant(ch);
         else
                System.out.println(ch + " is not a character");
    }

    static void checkVowelorConsonant(char mych) {
        if (mych == 'a' || mych == 'e' || mych == 'i' || mych == 'o' || mych == 'u'
                || mych == 'A' || mych == 'E' || mych == 'I' || mych == 'O' || mych == 'U') {
            System.out.println("Character "+ mych +" is a vowel");
        }else
            System.out.println("Character "+mych+" is a consonant.");

    }
}
