import java.util.Scanner;
public class AutomorphicNumber {
    /*
    Write a menu driven program to accept a number and check and display whether
    (i) it is a Prime Number or not (ii) it is an Automorphic Number or not.(Use
    switch-case statement)
    i. Prime number. Example: 3, 5, 7, 11, 13etc.
    ii.Automorphic number: An automorphic number is the number which is contained
       in the last digit(s) of its square. Example: 25 is an automorphic number
       as its square is 625 and 25 is present as the last two digits.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter your choice(1 or 2) : ");
            System.out.println("1. Finding Prime number");
            System.out.println("2. Finding Automorphic number");
            int choice = sc.nextInt();
            long lastDigit = 0;

            switch (choice) {
                case 1:
                    System.out.println("Enter the number: ");
                    num = sc.nextInt();
                    //3,5,7
                    for (int i = 2; i < num; i++) {
                        if (num % i == 0) {
                            System.out.println(num + " is not a prime number.");
                            break;
                        } else {
                            System.out.println(num + " is a prime number.");
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Enter the number: ");
                    num = sc.nextInt();
                    // 25 = 625, 76 = 5776
                    long squre = (long) num*num;
                    int originalNum = num;
                    while (num> 0) {
                       lastDigit  = (lastDigit * 10) + squre % 10;
                       squre = squre/10;
                        num = num / 10;
                    }
                    System.out.println(lastDigit);

                    long reversedNum =0;
                    while(lastDigit>0){
                        reversedNum = (reversedNum*10)+ lastDigit%10;
                        lastDigit = lastDigit/10;
                    }
                    System.out.println(reversedNum);

                    if(reversedNum == originalNum){
                        System.out.println(originalNum+" is an Automorphic Number");
                    }else{
                        System.out.println(originalNum+" is not an Automorphic Number");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Enter (0 to exit) ");
            num = sc.nextInt();
        }while (num != 0);
    }
}