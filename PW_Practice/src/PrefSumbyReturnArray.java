import java.util.Scanner;
public class PrefSumbyReturnArray {

    static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] makePrefixSumArray(int [] arr){
        int n = arr.length;
        int [] pref = new int[n];
        pref[0] = arr[0];

        for(int i = 1; i < n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int []arr = new int[n];

        System.out.println("Enter "+n+" elements in array");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Input Array");
        printArray(arr);
        int []pref = makePrefixSumArray(arr);
        System.out.println("\nAfter summing the suffix:");
        printArray(pref);


    }
}
