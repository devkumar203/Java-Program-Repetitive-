import java.util.Scanner;
public class Rectangle {
    /*
    Define a class with the following specification:
        Class Name:       Rectangle
        Member Variables: length, width

                      AcceptInput=> To accept the length and width of the rectangle
     Member Methods : Compute => To compute the area, perimeter and diagonal of the
                                  rectangle
                      DisplayData => To display the results
     */

    int length, width;
    int area, perimeter;
    double diagonal;

    public void AcceptInput(){
        Scanner sc =new Scanner(System.in) ;
        System.out.println("Enter the length of the rectangle: ");
        length = sc.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        width = sc.nextInt();
    }

    public void Compute(){
        area = (length * width);
        perimeter = 2*(length +width);
        diagonal = Math.sqrt(length*length + width* width);
    }

    public void DisplayData(){
        System.out.println("Area of the rectangle: "+ area);
        System.out.println("Perimeter of the rectangle: "+ perimeter);
        System.out.println("Diagonal of the rectangle: "+ diagonal);
    }

    public static void main(String[] args){
        Rectangle obj = new Rectangle();
        obj.AcceptInput();
        obj.Compute();
        obj.DisplayData();
    }
}
