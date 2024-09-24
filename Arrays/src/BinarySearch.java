import java.util.Scanner;
public class BinarySearch {
   public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//       int searchNumber;
//       int foundIndex = -1;
//       int start, mid, end;
//
//       int list[] = {11, 33, 40, 45, 68, 72, 89, 95, 99};
//
//       System.out.println("Enter a number to search: ");
//       searchNumber = sc.nextInt();
//
//       start = 0;
//       end = list.length-1;
//
//       while(start <= end){
//          mid = (start + end)/2;
//          if(searchNumber == list[mid]){
//              foundIndex = mid;
//              break;
//          }
//          else if(searchNumber < list[mid])
//              end = mid - 1;
//          else
//              start = mid + 1;
//       }
//
//       if(foundIndex >= 0)
//           System.out.println("Number "+searchNumber+" found at index "+foundIndex);
//       else
//           System.out.println("Number "+searchNumber+" not found");

       int start=0, end, searchNumber, foundIndex = -1;
       int mid;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");
       int num = sc.nextInt();
       int arr[] = new int[num];

       System.out.println("Enter the elements of an array :");
       for(int i = 0; i<arr.length; i++){
           arr[i] = sc.nextInt();
       }

       System.out.println("Elements of an array are: ");
       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i]+" ");           //12, 14, 16, 18, 20, 22, 24
       }
       System.out.println();
       System.out.println("Enter the search number: ");
       searchNumber = sc.nextInt();

       end = arr.length-1;

       while(start <= end){
           mid = (start + end)/2;
           if(arr[mid] == searchNumber){
               foundIndex = mid;
               break;
           }
           else if(searchNumber < arr[mid]){
               end = mid - 1;
           }
           else
               start = mid + 1;
       }

       if(foundIndex >= 0){
           System.out.println("Search number is "+searchNumber+" at index "+foundIndex);
       }else
           System.out.println(searchNumber+ " is not found.");

















   }
}
