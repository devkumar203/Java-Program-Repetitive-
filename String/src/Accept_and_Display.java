import java.util.Scanner;
public class Accept_and_Display {
    /*
    Write a program to accept a string and display.
    i) The number of lowercase characters
    ii)The number of uppercase characters
    iii) The number of special characters
    iv) The number of digits present in the string
     */
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = sc.nextLine();
        int length = string.length();
        char tempChar;
        int lwcase =0, upCase = 0,digits = 0, specialchar= 0;
        for(int i = 0; i < length; i++){
            tempChar = string.charAt(i);
            if(tempChar >= 'a' && tempChar <= 'z'){
                lwcase++;
            }
            else if(tempChar >= 'A' && tempChar <= 'Z'){
                upCase++;
            }
            else if(tempChar >= '0' && tempChar <= '9'){
                digits++;
            }
            specialchar++;
        }

        System.out.println("Number of Uppercase is: "+ upCase);
        System.out.println("Number of Lowercase is: "+ lwcase);
        System.out.println("Number of special character is: "+ specialchar);
        System.out.println("Number of digits is: "+ digits);

        sc.close();
    }
}
