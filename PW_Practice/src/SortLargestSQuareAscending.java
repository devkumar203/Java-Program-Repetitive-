import java.util.Scanner;
public class SortLargestSQuareAscending {

        static void swap(int[] arr, int i, int j){
            for( i  = 0 ; i < arr.length; i++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
    }

    static void reverse(int [] arr){
            int i = 0, j = arr.length-1;
            while(i < j ){
                swap(arr, i, j);
                i++;
                j--;
            }
    }

        static int[] SortArray(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1, k = 0;
        int [] ans = new int[n];

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else
                ans[k++] = arr[right] * arr[right];
        }
            return ans;
        }

        static void printArray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int num = sc.nextInt();
        int [] arr = new int[num];

        System.out.println("Enter the "+num+" elements:");
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);
       int ans[] = SortArray(arr);
        reverse(ans);
        System.out.println("Sorted array:");
        printArray(ans);

    }
}
