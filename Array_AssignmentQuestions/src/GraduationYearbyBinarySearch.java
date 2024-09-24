import java.util.Scanner;
public class GraduationYearbyBinarySearch {
    /*
    Write a program to accept the year of graduation from school as an integer value from the user.
    Using the Binary Search technique on the sorted array of integers given below, output the message
    "Record exits" if the value input is located in the array. If not, output the message "Record does
    not exist".(1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010)
     */
    public static void main(String[] args) {
        int[] gradyear = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
      boolean recordExist = BinarySearch(gradyear, year);

      if(recordExist){
          System.out.println("Record Exist!");
      }else
          System.out.println("Record doesn't exist!");
    }

     public static boolean BinarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        for(int i = 0; i < end; i++){
            int mid = (start + end)/2;

            if(arr[mid] == key){
                return true;
            }
           else if(arr[mid] < key){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
     }
}
