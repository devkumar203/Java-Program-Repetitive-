import java.util.Scanner;
public class SortZeroInArray {

    static void SortzerotoFirst(int arr[]){
        int num = arr.length;
        int zero= 0;
        for(int i = 0; i < num; i++) {
            if (arr[i] == 0) {
                zero++;
            }
        }
        for(int i = 0; i < num; i++){
            if(i < zero){
                arr[i] = 0;
            }else
                arr[i] = 1;
        }
    }

    static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int [] arr = new int[n]; // 5

        System.out.println("Enter the "+n+" elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();  // 1 0 0 1 0 0 1 1 0 1
        }
        System.out.println("Original Array:");
        printArray(arr);
        SortzerotoFirst(arr);
        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
