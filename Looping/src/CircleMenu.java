import java.util.Scanner;
public class CircleMenu {
    /*
    Using a do-while loop, write a program in java to display the following
    menu for user selection.
      Circle Menu
      ============
    1. Calculate Diameter
    2. Calculate Circumference
    3. Calculate Area
    4. Exit
    Enter your choice:
    If the user has selected option 1, 2 or 3, ask for the radius input,
    compute and display the relevant measure.
    If the user has selected option 4, exit the program.
     */
    public static void main(String[] args){
        int choice;
        double radius;
        do{
            System.out.println("Circle menu\n==========");
            System.out.println("1. Calculate Diameter");
            System.out.println("2. Calculate Circumference");
            System.out.println("3. Calculate Area");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
             choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the radius: ");
                    radius = sc.nextInt();
                    System.out.println("Diameter is: " +(2*radius));
                    break;

                case 2:
                    System.out.println("Enter the radius: ");
                     radius = sc.nextInt();
                    System.out.println("Circumference is: "+(2*Math.PI*radius));
                    break;

                case 3:
                    System.out.println("Enter the radius: ");
                    radius = sc.nextInt();
                    System.out.println("Area of circle is: "+(Math.PI*radius*radius));
                    break;

                case 4:
                    System.out.println("Thank You.");
                    break;

                default:
                    System.out.println("***Invalid Choice***");
            }
        }while(choice !=4);
    }
}
