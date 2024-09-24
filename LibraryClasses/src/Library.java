import java.util.Scanner;
public class Library {
    /*
    Define a class Library with the following description
    Instance variable/Data members:
    int acc_num  : stores the accession number of the book
    String title : stores the title of the book
    String author : stores name of the author
    Member Methods:
    i) void input()   : to input and store accession number, title and author.
   ii) void compute() : to accept the number of days late, calculate and display the fine charge
                        at the rate of Rs. 2 per day
  iii) void display() : to display the details in the following format:
           Accession Number       Title        Author
    Write a main() method to create an object of the class and call the above member methods.
     */

    int acc_num;
    String title, author;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the accession number :");
        acc_num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the title :");
        title = sc.nextLine();

        System.out.println("Enter the author :");
        author = sc.nextLine();
    }

    public void compute(){
        int numDays, fineAmount;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of days late: ");
        numDays = sc.nextInt();
        fineAmount = 2*numDays;
        System.out.println("Fine to be paid is: "+fineAmount);
        sc.close();
    }

    public void display(){
        System.out.println("Accession Number\tTitle\tAuthor");
        System.out.println(acc_num+"\t"+title+"\t"+author);
    }

    public static void main(String [] args){
        Library obj = new Library();
        obj.input();
        obj.compute();
        obj.display();
    }

}
