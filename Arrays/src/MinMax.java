import java.util.Scanner;
public class MinMax {
    /*
    Write a program to accept 10 different numbers in a single dimensional array. Display the greatest and smallest numbers
    of the array element.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Input "+num+" elements : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
                if(arr[i] > max)
                    max = arr[i];

                if(arr[i] < min)
                    min = arr[i];
        }

        System.out.println("The greatest element of an array is : "+max);
        System.out.println("The smallest element of an array is : "+min);





}
}
