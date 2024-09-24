import java.util.Scanner;
public class FruitJuice {
    /*
    Define a class called FruitJuice with the following description
    Instance variable/Data members:
    int product_code  : stores the product code number
    String flavour    : stores the flavour of the juice.(orange, apple, etc)
    String pack_type  : stores the type of packaging(tetra-pack, bottle, etc)
    int pack_size     : stores package size(200ml, 400ml, etc.)
    int product_price : stores the price of the product
    Member Methods:
    FruitJuice() - default constructor to initialise integer data members to zero
                   and string data members to "".

    void input() - to input and store the product code, flavour, pack type, pack size
                   and product price.

    void discount() - to reduce the product price by 10.

    void display() - to display the product code, flavour, pack type, pack size,
                     and product price.
     */

    int product_code, pack_size, product_price;
    String flavour, pack_type;

    FruitJuice(){
        product_code = 0;
        pack_size = 0;
        product_price = 0;
        flavour = "";
        pack_type = "";
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code :");
        product_code = sc.nextInt();

        System.out.println("Enter the pack size :");
        pack_size = sc.nextInt();

        System.out.println("Enter the product price :");
        product_price = sc.nextInt();

        System.out.println("Enter the flavour :");
        flavour = sc.nextLine();

        System.out.println("Enter pack type :");
        pack_type = sc.nextLine();
    }

    public void discount(){
        product_price = product_price -10;
    }

    public void display(){
        System.out.println("Product code number :" + product_code);
        System.out.println("Flavour :" + flavour);
        System.out.println("Pack type :" + pack_type);
        System.out.println("Pack size :" + pack_size);
        System.out.println("Product price :" + product_price);
    }

    public static void main(String[] args){
        FruitJuice obj = new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }

}
