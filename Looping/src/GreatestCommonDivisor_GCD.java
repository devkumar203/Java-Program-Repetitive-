import java.util.Scanner;
public class GreatestCommonDivisor_GCD {
    public static void main(String[] args){

        //Easy Way.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int a = sc.nextInt();
//        System.out.println("Enter the Second number: ");
//        int b = sc.nextInt();
//        int g = 0;
//        for(int i = 1; i<=a; i++){
//            if(a%i ==0 && b%i==0)
//                g = i;
//        }
//        System.out.println("GCD :"+g);

        //Mysterious Way
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.println("The Greatest common Divisor is: " +GCD(n1, n2));
    }
    static int GCD(int num1, int num2){
        while (num1 != num2){
            if(num1>num2){
                num1 = num1 - num2;
            }else
                num2 = num2 - num1;
        }
        return num1;
    }
}
