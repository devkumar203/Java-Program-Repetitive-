import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Input the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();          //12, 5, 23, 1, 34, 22
        }

        System.out.println("Elements of an array are: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i= 0; i <arr.length; i++){
            int minNumber = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minNumber]){
                    minNumber = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minNumber];
            arr[minNumber] = temp;
        }

        System.out.println("Sorted array is :");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
