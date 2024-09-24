import java.util.Scanner;
public class SortEvenOddnumBySwap {

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void SortedEvenandOdd(int [] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 ==0){
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] %2 == 0){
                left++;
            }
            if(arr[right] %2 == 1){
                right--;
            }
        }
    }
    static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of an array:");
        for(int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        printArray(arr);
        SortedEvenandOdd(arr);
        System.out.println("\nSorted Array");
        printArray(arr);

    }
}
