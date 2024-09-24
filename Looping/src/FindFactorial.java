import java.util.Scanner;
public class FindFactorial {
    public static void main(String[] args){
//        //For-loop -------------->
//        int fact = 1;
//        for(int i = 1; i < 10; i++){
//            //10! = 1*2*3*4*5*6*7*8*9*10
//            fact = fact *i;
//            System.out.println(fact);

        //While loop---------->
//        int n= 1;
//        int fact = 1;
//        while(n <= 10){
//            fact = fact *n;
//            System.out.println(fact);
//            n++;
//    }
        //while-loop using Scanner class
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the factorial in integer.");
//        int num = sc.nextInt();
//        int n = 1;
//        int fact = 1;
//        System.out.println("Here is your factorial..");
//        while(n <=num){
//            fact = fact *n;
//             n++;
//        }
//        System.out.println(fact);

        //While-loop using Scanner class with post decrement.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial.");
        int num = sc.nextInt();
        int fact = 1;
        System.out.println("Factorial of "+num+" is :");
        while(num >0 ){
            fact = fact*num;
            num--;
        }
        System.out.println(fact);
        }

}
