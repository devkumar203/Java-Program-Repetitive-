import java.util.Scanner;
public class SumProduct {
    public static void main(String[] args){
        /*
        Write a program in java to input 10 integers and save them in a single dimension array. Perform the
        following task:
        i) Print the elements in the array on a single line followed by a space.
       ii) Compute and print the sum of elements at even indices.
      iii) Compute and print the product of elements at odd indices.
         */
        int sumEven = 0;
        int product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Input the number: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //i)
        System.out.println("Elements of an array are:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //ii)
        for(int i = 0; i < arr.length; i++){
            if(i %2 ==1){
                product = product * arr[i];
            }else
                //iii)
               sumEven = sumEven + arr[i];
        }

        System.out.println("Sum of even number : "+ sumEven);
        System.out.println("Product of odd number : "+ product);
    }
}
