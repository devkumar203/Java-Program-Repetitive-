import java.util.Scanner;
public class Change_Case{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String string = sc.nextLine();

        int length = string.length();
        String newString = "";
        char tempchar;
        for(int i = 0; i < length; i++){
            tempchar = string.charAt(i);
            if(tempchar >= 'a' && tempchar <= 'z'){
                newString = newString + Character.toUpperCase(tempchar);
            }else if(tempchar >= 'A' && tempchar <= 'Z'){
                newString = newString + Character.toLowerCase(tempchar);
            }else
                newString = newString + tempchar;
        }

        System.out.println("New String after conversion :");
        System.out.println(newString);
        sc.close();
    }
}