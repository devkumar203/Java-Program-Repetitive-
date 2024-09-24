import java.util.Scanner;
public class CompositeNumber {
    /*
    Write a program to check whether the given number is a composite
    number or not.
    HINT: A composite number is a positive integer that has factors
    other than 1 and itself.
     */

//    //Simple way
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the positive integer");
//        int num = sc.nextInt();
//        for(int i = 2; i<=num/2; i++){
//            if(num%i==0){
//                System.out.println(num+" is a composite number.");
//            }else{
//                System.out.println(num+" is not a composite number.");
//            }
//        }
//    }

    static boolean IsComposite(int num) {
        boolean composite = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                composite = true;
            }
        }
        return composite;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive integer");
        int num = sc.nextInt();

        while (num != 0) {
            if (IsComposite(num)) {
                System.out.println(num + " is a Composite number");
            } else
                System.out.println(num + " is Not a Composite number");

            System.out.println("Enter an integer (0 to exit)");
            num = sc.nextInt();
        }
        System.out.println("Exiting...");
    }
}

