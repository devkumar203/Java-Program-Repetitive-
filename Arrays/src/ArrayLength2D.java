import javax.swing.*;

public class ArrayLength2D {
    public static void main(String[] args){
        int array2D[][] = {{'S', 'U', 'N', 'D', 'A', 'Y'},
                           {'M', 'O', 'N', 'D', 'A', 'Y'}};

        int rows = array2D.length;
        int column = array2D[0].length;

        System.out.println("Number of rows are: "+ rows);
        System.out.println("Number of column are: "+ column);
    }
}
