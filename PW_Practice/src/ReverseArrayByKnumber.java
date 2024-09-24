import java.util.Scanner;
public class ReverseArrayByKnumber {

    static int[] rotate(int [] arr, int k ){
        int n = arr.length; //5
        k = k%n;  // 4% 5==  4
        int [] ans = new int[n];  //5
        int j = 0;

        for(int i = n-k; i < n; i++){   //  1 < 5
            ans[j++] = arr[i];   //  2 3 4 5
        }

        for(int i = 0; i < n-k; i++){  // 0 < 1
            ans[j++] = arr[i];   ///
        }

        return ans;
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the "+n+" elements");
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();   // 1 2 3 4 5
        }

        System.out.println("Enter k: ");
        int k = sc.nextInt();   // 4

        System.out.println("Original array");
        printArray(arr);

        int[] ans = rotate(arr,k);
        System.out.println("Array after notation");
        printArray(ans);
    }
}
