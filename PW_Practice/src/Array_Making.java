import java.util.Scanner;
public class Array_Making {

        static void printArray(int[] arr) {
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter size of an array:");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Original Array:");
            printArray(arr);
            //trying to copy arr to arr_2
            int[] arr_2 = arr;

            System.out.println("Copied Array:");
            printArray(arr_2);
        }
    }

