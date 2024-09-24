import java.util.Scanner;
public class PerfectNumber {
    /*
    Write a program to check whether a number is a perfect number or not
    using a do-while loop.
    Hint: A number is said to be perfect of sum of all its factors
          (excluding the number itself) is equal to the number.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int num = sc.nextInt(); //28
        int i=1;
        int sum=0;
        //Using for-loop.
//        int sum=0;
//       for(int i = 1; i<=num/2; i++){
//           if(num%i==0) {
//               sum = sum + i;
//           }
//       }
//
//        if(sum == num){
//            System.out.println(num+" is a perfect number");
//        }else
//        {
//            System.out.println(num+"is not a perfect number.");
//        }

        //Using do-while loop.
        do{
            if(num%i==0){
                sum += i;
            }
            i++;
            System.out.println(i);
        }while(i<=num/2);

        if(sum == num){
            System.out.println(num+" is Perfect number");
        }else{
            System.out.println(num+" is Not a Perfect number");
        }
    }
}
