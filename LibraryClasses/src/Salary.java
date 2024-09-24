import java.util.Scanner;
public class Salary {
    /*
    Define a class Salary as described below:
       Data Members:   Name, Address, Phone, Subject, Specialisation, Monthly Salary, Income Tax
                      i) To accept the details of a teacher including the monthly salary
                     ii) To display the details of the teacher
                    iii) To compute the annual income tax at 5% of the annual salary above Rs. 1,75,000

       Write a main() method to create an object of the class and call the above member methods.
     */

    String name, address, subject, specialisation;
    long phone;
    double monthlySalary, incomeTax;

    public void acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.nextLine();

        System.out.println("Enter the address: ");
        address = sc.nextLine();

        System.out.println("Enter the subject: ");
        subject = sc.nextLine();

        System.out.println("Enter the specialisation: ");
        specialisation = sc.nextLine();

        System.out.println("Enter the phone no.");
        phone = sc.nextLong();

        System.out.println("Enter the monthly salary: ");
        monthlySalary = sc.nextDouble();

    }

    public void displayDetail(){
        System.out.println("Name = "+name);
        System.out.println("Address = "+address);
        System.out.println("Phone no. = "+phone);
        System.out.println("Subject = "+subject);
        System.out.println("Specialisation = "+specialisation);
        System.out.println("Monthly salary = "+monthlySalary);
        System.out.println("Income Tax = "+incomeTax);
    }

    public void Compute(){
        double annualSalary = 12 * monthlySalary;
        if(annualSalary > 175000)
            incomeTax = annualSalary *0.05;
        else
            incomeTax = 0;
    }

    public static void main(String[] args){
        Salary salary = new Salary();
        salary.acceptDetails();
        salary.Compute();
        salary.displayDetail();
    }
}
