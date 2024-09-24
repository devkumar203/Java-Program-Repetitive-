import java.util.Scanner;
public class SecondSmallestInteger {
    /*
    Find the second smallest element in the array.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int input = sc.nextInt();
        int arr[] = new int[input];

        System.out.println("Enter the "+input+" number of an element:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
                if(min > arr[i]){
                    min = arr[i];
            }
        }

        System.out.println("Minimum number of an array is : "+min);
    }
}
