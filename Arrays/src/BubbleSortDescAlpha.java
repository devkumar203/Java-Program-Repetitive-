import java.util.Scanner;
public class BubbleSortDescAlpha {
    /*
    Write a program in java to store the characters in word COMPUTER in a single dimensional array.
    Arrange and display all the characters in descending order using Bubble Sort.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int ch = sc.nextInt();
        sc.nextLine();

        char list[] = new char[ch];

        System.out.println("Input the elements of an array: ");
        for(int i = 0; i < list.length; i++){
            list[i] = Character.toUpperCase(sc.nextLine().charAt(0));
        }

        System.out.println("Displaying the elements of an array: ");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
        int length = list.length;

        for(int i = 0; i < length-1; i++){
            for(int j = 0; j <length-i-1; j++) {
                if (list[j] < list[j + 1]) {
                    //Swap the adjacent elements
                    char temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        System.out.println("The arrangement of characters in descending order are: ");
        for(int i = 0; i < length; i++){
            System.out.print(list[i]+" ");
        }
    }
}
