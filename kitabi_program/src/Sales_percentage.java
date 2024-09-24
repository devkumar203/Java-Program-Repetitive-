import java.util.*;
public class Sales_percentage {
    public static void main(String[] args){
        double totalSales, commissionRate, commissionAmount, advanceAmount, payAmount;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter total sales this month : ");
        totalSales = input.nextDouble();

        System.out.println("Enter advance amount: ");
        advanceAmount = input.nextDouble();

        if(totalSales < 20000){
            commissionRate = 0.0;
        }
        else if(totalSales <40000){
            commissionRate = 0.03;
        }
        else if(totalSales < 60000){
            commissionRate = 0.05;
        }
        else if(totalSales < 80000){
            commissionRate = 0.08;
        }
        else
            commissionRate = 0.10;

        commissionAmount = totalSales * commissionRate;
        payAmount = commissionAmount - advanceAmount;

        System.out.println("Commission Rate: "+ (commissionRate * 100) + "%");
        System.out.println("Amount Payable: "+ payAmount);
    }
}
