import java.util.Scanner;
public class ArmstrongNumber {
    /*
    Write a program to accept along integer and check if it is an
    Armstrong Number.
    HINT: Armstrong number is a number which is equal to the sum of
    digits raise to the power total number of digits in the number.
    For example, 8208 is an Armstrong number because
                 8208 = 8^4+2^4+0^4+8^4 = 4096+16+0+4096 = 8208.
     */
//    public static void main(String[] args){
//        int n, arm = 0, rem, c;
//        System.out.println("Enter any number: ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        c = n;
//        while(n>0){
//            rem = n%10;
//            arm = (rem*rem*rem)+arm;
//            n = n/10;
//        }
//        if(c == arm){
//            System.out.println("Armstrong Number");
//        }else{
//            System.out.println("Not a Armstrong number");
//        }
//    }

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        int totalDigit=0, SumOfPower = 0;
//        int numOriginal;
//        numOriginal = num;
//        while(num != 0){
//            totalDigit++;
//            num = num/10;
//        }
//
//        num = numOriginal;
//
//        while (num>0){
//            int digit = num%10;
//            int digitpower = (int)Math.pow(digit, totalDigit);
//            SumOfPower = SumOfPower + digitpower;
//            num  = num/10;
//        }
//
//        if(numOriginal == SumOfPower){
//            System.out.println(numOriginal+" is an Armstrong number.");
//        }else
//            System.out.println(numOriginal+" is not an Armstrong number.");

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int OriginalNumber;
        int Totaldigit =0, sumofPower = 0;
        OriginalNumber = num;

        while (num != 0){
            Totaldigit++;
            num = num/10;
        }

        num = OriginalNumber;

        while(num >0){
            //finding individual value of any number
            int digit = num%10;
            //finding power of any individual number
            int powerOfDigit = (int)Math.pow(digit, Totaldigit);
            //Finding sum of powerOfDigit
            sumofPower = sumofPower + powerOfDigit;
            //Dividing number by 10 to true the condition(num>0)
            num = num/10;
        }

        if(sumofPower == OriginalNumber){
            System.out.println(OriginalNumber+" is an Armstrong Number");
        }else
            System.out.println(OriginalNumber+" is not an Armstrong Number");
    }















}
