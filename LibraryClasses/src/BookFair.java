import java.util.Scanner;
public class BookFair {
    /*
    Define a class named BookFair with the following description:
    Instance variables/Data members:
    String Bname: stores the name of the book.
    double price: stores the price of the book.
    Member Methods
        i. BookFair() : default constructor to initialise data members.
       ii. void Input():to input and store the name and the price of the book.
      iii. void calculate(): to calculate the price after discount. Discount is
                             calculated based on the following criteria:

           PRICE                                        Discount
           Less than or equal to Rs 1000                2% of price

           More than Rs 1000 and less than              10% of price
           or equal to Rs 3000

           More than Rs 3000                            15% of price

      iv. void display(): to display the name and price of the book after discount.
      Write a main() method to create an object of the class and call the above member
      methods.
     */
    String Bname;
    double price, dprice;

    BookFair(){
        Bname = "";
        price = 0;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book name: ");
        Bname = sc.nextLine();

        System.out.println("Enter the price of Book: ");
        price = sc.nextInt();
    }

    public void calculate(){
        if(price <= 1000){
            dprice = price *0.02;
        } else if(price >1000 && price <=3000){
            dprice = price * 0.10;
        }else
            dprice = price *1.5;
    }

    public void display(){
        System.out.println("Name of the book: "+Bname);
        System.out.println("Price of the book: "+(price-dprice));
    }

    public static void main(String[] args){
        BookFair obj = new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
