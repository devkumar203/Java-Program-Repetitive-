import java.util.Scanner;
public class BinarySearch {
    /*
    Write a program to perform binary search on a list of an integers given below, to search
    for an element input by the user. If it is found display the element along with its
    position, otherwise display the message "Search element not found"
    5, 7, 9, 11, 15, 20, 30, 45, 89, 97
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 7, 9, 11, 15, 20, 30, 45, 89, 97};
        int length = arr.length;
        System.out.println("Elements of an array are :");
        for(int i = 0; i < length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the Search number: ");
        int searchNumber = sc.nextInt();

        int foundIndex = -1;
        int start = 0;
        int end = length-1;
       for(int i = 0; i <= end; i++){
           int mid = (start + end)/2;

           if(searchNumber == arr[mid]){
               foundIndex = mid;
               break;
           }else if(arr[mid] < searchNumber){
               start = mid + 1;
           }else
               end = mid - 1;
       }

       if(foundIndex >=0){
           System.out.println("Number "+ searchNumber+" found at index "+ foundIndex);
       }else
           System.out.println("Number "+ searchNumber+" not found");

       sc.close();
    }
}
