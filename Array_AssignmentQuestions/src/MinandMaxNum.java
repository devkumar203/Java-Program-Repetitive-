import java.util.Scanner;
public class MinandMaxNum {
    /*
    Write a program to initialise the given data in an array and find the minimum and maximum values along with
    the sum of the given elements.
    Numbers: 2, 5, 4, 1, 3
    Output:
    Minimum value: 1
    Maximum value: 5
    Sum of the elements: 15
     */

    public static void main(String[] args){
        int num[] = {2, 5, 4, 1, 3};

        int min = num[0];
        int max = num[0];
        int sum = 0;
        for(int i = 1; i< num.length; i++){

            if(num[i] < min) {
                    min = num[i];
                }

            if(num[i] > max){
                    max = num[i];

            }
            sum = sum + num[i];
        }

        System.out.println("Minimum value: "+ min);
        System.out.println("Maximum value: "+ max);
        System.out.println("Sum of the elements: "+ sum);


    }
}
