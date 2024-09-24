import java.util.Scanner;
public class BubbleSort {
    /*
    Write a program to input 10 integer elements in an array and sort them in descending order using
    bubble sort technique.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 10;
        int temp = 0;
        int arr[] = new int[num];
        System.out.println("Enter the elements of an array");
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        {
            for (int i = 0; i < num-1; i++) {
                for (int j = 0; j < num-i-1; j++) {
                    if (arr[j] > arr[j + 1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            System.out.println("Sorted array is: ");
            for(int i = 0; i < num; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
