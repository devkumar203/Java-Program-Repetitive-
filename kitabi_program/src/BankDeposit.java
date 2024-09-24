import java.util.Scanner;
public class BankDeposit {
    public static void main(String[] args){
        double P, r, maturityAmount;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("**Menu**");
        System.out.println("1. Term Deposit.");
        System.out.println("2. Recurring Deposit.");

        System.out.println("Enter the valid choice(1 or 2): ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter principal: ");
                P = sc.nextInt();
                System.out.println("Enter rate: ");
                r = sc.nextInt();
                System.out.println("Enter Time period in year: ");
                n = sc.nextInt();

                maturityAmount = P*Math.pow(1.0+(r/100.0),n);
                System.out.println("The maturity amount(A) is: "+maturityAmount);
                break;

            case 2:
                System.out.println("Enter the monthly installment: ");
                P = sc.nextInt();
                System.out.println("Enter the rate of interest: ");
                r = sc.nextInt();
                System.out.println("Enter the Time period in month: ");
                n = sc.nextInt();

                //Don't know why but after all number we have to put .0 to receive correct output here.
                maturityAmount = P*n + P* (n*(n+1)/2.0) * (r/100.0) * (1.0/12.0);
                System.out.println("The maturity amount(A) is: "+maturityAmount);
                break;

            default:
                System.out.println("Invalid Choice entered:");
        }
    }
}
