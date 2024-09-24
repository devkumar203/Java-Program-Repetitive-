import java.util.Scanner;
public class ParkingLot {
    /*
    Define a class ParkingLot with the following description:
    Instance variables/Data members:
    int vno    : to store the vehicle number
    int hours  : to store the number of hours the vehicle is parked in the parking lot
    double bill: to store the bill amount
    Member Methods:
          i) void input()    : to input and store vno and hours
         ii) void calculate(): to compute the parking charge at the rate of Rs. 3 for the first
                               hour or part thereof, and Rs.1.50 for each additional hour or part
                               thereof.
        iii) void display()  : to display the detail
    Write a main() method to create an object of the class and call the above methods.
     */
    int vno, hours;
    double bill;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vno : ");
        vno = sc.nextInt();

        System.out.println("Enter the no. of hours : ");
        hours = sc.nextInt();
    }

    public void calculate(){
        bill = 3 + (hours -1)*1.5;
    }

    public void display(){
        System.out.println("Vno is : "+vno);
        System.out.println("No. of hours : "+hours);
        System.out.println("Total bill amount : "+bill);
    }

    public static void main(String[] args){
        ParkingLot obj = new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
