import java.util.Scanner;
public class reverseArray {
    /*
    Write a program that reads ten integers and displays them in the reverse order in
    which they were read.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 10;
        int arr[] = new int[num];

        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Correct order array: ");
        for(int i = 0; i < num; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse order array: ");
        for(int i = num-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }

    sc.close();
    }
}
