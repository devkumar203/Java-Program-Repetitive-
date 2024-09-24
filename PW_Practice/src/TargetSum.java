import java.util.Scanner;
public class TargetSum {

    static int printTagertSum(int arr[], int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
//                if((arr[i]+ arr[j]) == target){// for the sum of only two number
//                    ans++;
//                }
                for(int z = j+1; z < n; z++){
                    if(arr[i]+arr[j]+arr[z] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size:");
        int input = sc.nextInt();
        int arr[] = new int[input];

        System.out.println("Enter "+input+" number of elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();

        System.out.println(printTagertSum(arr, target));

    }
}
