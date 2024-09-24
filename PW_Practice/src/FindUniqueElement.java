import java.util.Scanner;
public class FindUniqueElement {
    /*
    Find the unique number in a given Array where all the elements are being
    repeated twice with one value being unique.
     */

    static int uniqueNumber(int arr[]){
        int n = arr.length;

        // UNIQUE NUMBER USING XOR METHOD.
        /*
        int uniqueNum = 0; // Initialize the unique number

        for (int num : arr) {
            uniqueNum ^= num; // XOR each number with the current uniqueNum
        }

        return uniqueNum; // The result will be the unique number
         */

        //USING FOR LOOP.
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = 0;
            for(int i = 0; i < n; i++ ){
                if(arr[i] > 0){
                    ans = arr[i];
                }
            }
      return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of an array:");
        int input = sc.nextInt();
        int arr[] = new int[input];

        System.out.println("Enter the elements of an array:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Unique number is "+uniqueNumber(arr));
    }
}

