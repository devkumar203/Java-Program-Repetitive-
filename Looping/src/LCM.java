import java.util.Scanner;
public class LCM {
    public static void main(String[] args){

        //Wrong Way--->
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int b = sc.nextInt();
//        int d1=0, d2 = 0;
//        int product =1;
//        for(int i = 1; i<= a; i++){
//            if(a%i==0  && b %i == 0) {
//                product *= i;
//                System.out.println(i);
//            }
//        }
//       System.out.println("LCM is : "+product);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Lowest common Factor is: "+LCM(a, b));
    }

    static int LCM(int num1, int num2){
        int lcm = (Math.max(num1, num2));

        while(true) {
            if (lcm % num1 == 0 && lcm % num2 == 0)
                break;

            lcm++;
        }
        return lcm;
    }
}
