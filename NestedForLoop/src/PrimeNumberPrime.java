import java.util.Scanner;
public class PrimeNumberPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start number: ");
        int start = sc.nextInt();

        System.out.println("Enter the end number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between "+start+" and "+end+" are:");
        for(int num = start; num <= end; num++){
            boolean prime = true;

            for(int i = 2; i<= num/2; i++){
                if(num%i==0){
                    prime = false;
                    //factors exist, no need to continue further
                    break;
                }
            }

            if(prime)
                System.out.print(num+" ");
        }
    }
}
