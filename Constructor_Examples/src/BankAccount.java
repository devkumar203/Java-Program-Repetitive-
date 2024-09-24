import java.util.Scanner;
public class BankAccount {
    /*
    Define a class BankAccount as described below:
    Data Members/Instance Variables:
    holdersName: to store the name of the account holder
    accountNumber: to store the account number
    balanceAmount: to store the balance amount
    Member Methods:
       i. A constructor to initialise the data members. Initialise the
          balanceAmount with balance of Rs.100 on creation
      ii. To deposit money into account.
     iii. To withdraw money from the account. Ensure that there is enough
          balance before withdrawal.
    Write a main method to create an object of the class and call the above
    member methods.
     */

    String holderName;
    long accountNumber;
    double balanceAmount;

    public BankAccount(String name, long number){
        holderName = name;
        accountNumber = number;
        balanceAmount = 100.0;
    }

    public void Deposite(double amount){
        balanceAmount += amount;
    }

    public void Withdraw(double amount){
        if(amount <= balanceAmount)
            balanceAmount -= amount;
    }

    public void Display(){
        System.out.println("Name of the Account Holder: "+ holderName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Balance Amount: "+ balanceAmount);
    }

    public static void main(String[] args){
        BankAccount objAccount = new BankAccount("Joe Bloggs", 1122334455);
        objAccount.Deposite(20000);
        objAccount.Withdraw(11750);
        objAccount.Display();
    }
}
