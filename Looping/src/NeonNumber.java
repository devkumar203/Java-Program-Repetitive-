import java.util.Scanner;
public class NeonNumber {
       /*
         Write a java program to check whether the given number is a
         Neon number or not.
         HINT: A number is said to be a Neon number if the sum of digits
         of the square of the number is equal to the number itself.
         For example, if the input number is 9, its square is 9*9=81
         and sum of the digits is also 9(=8+1).
        */

    /*
    int a = 9;
    num = Math.pow(a,2)
     */

    //MY logic(Simple way)------>
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//
//        int power = (int)Math.pow(num, 2);
//        int digit = 0, sum = 0;
//        while (power !=0){
//            digit = power%10;
//            sum = sum +digit;
//            power = power/10;
//        }
//
//        if(sum == num){
//            System.out.println(num+" is a Neon Number");
//        }else
//            System.out.println(num+" is not a Neon Number");
//    }

    //By using method-------->

    static boolean isNeon(int num){
        int square = num * num;
        int sum = 0;
        while (square != 0){
            int digit = square%10;
            sum = sum + digit;
            square = square/10;
        }
        return (sum == num);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        while (num != 0){
            if(isNeon(num)){
                System.out.println(num+" is a Neon number.");
            }else{
                System.out.println(num+" is not a Neon number.");
            }

            System.out.println("Enter an integer(0 to exit)");
            num = sc.nextInt();
        }
        System.out.println("Exiting...");
    }


}
