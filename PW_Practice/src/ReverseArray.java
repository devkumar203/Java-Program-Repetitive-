import java.util.Scanner;
public class ReverseArray {

static int[] reverseArray(int []arr){
    int n = arr.length;

    int [] ans = new int[n];
   // int j = 0;

    //Traverse original array in reverse direction
//    for(int i = n-1; i >= 0; i--){
//         ans[j++] = arr[i];
//    }

    //Using While-loop
    int i = n-1, j = 0;
    while(i >= 0){
        ans[j++] = arr[i--];
    }
    return ans;
}
static void printArr(int [] arr){
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
}

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        int []ans= reverseArray(arr);

        printArr(ans);
    }
}