import java.util.Scanner;

public class Word_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, count = 0;
        char tmpChar;
        String tempWord = "";

        System.out.println("Enter a string:");
        String searchString = sc.nextLine();
        searchString = searchString.trim() + " "; // Append a space to handle word checking.

        length = searchString.length();

        System.out.println("Enter the word to search for:");
        String searchWord = sc.next();

        for (int i = 0; i < length; i++) {
            tmpChar = searchString.charAt(i);
            if (tmpChar == ' ') {
                if (tempWord.compareToIgnoreCase(searchWord) == 0) {
                    count++;
                }
                tempWord = ""; // Reset the tempWord after checking.
            } else {
                tempWord = tempWord + tmpChar;
            }
        }

        // Check if the last word matches the searchWord (in case the sentence doesn't end with a space).
        if (tempWord.compareToIgnoreCase(searchWord) == 0) {
            count++;
        }

        System.out.println("Frequency of '" + searchWord + "' is: " + count);
        sc.close();
    }
}
