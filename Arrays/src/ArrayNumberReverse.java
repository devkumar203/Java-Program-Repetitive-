import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ArrayNumberReverse {
    /*
    Enter 5 floating point numbers:
    34.7
    45.5
    66.0
    99
    125.9
    Numbers in reverse order are:
    125.9
    99.0
    66.0
    45.5
    34.7
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num[] = new float[5];
        System.out.println("Enter 5 floating point numbers: ");
        for(int i = 0 ; i<5; i++)
            num[i]  = sc.nextFloat();

            System.out.println("Numbers in reverse order: ");
            for(int i = 4; i >=0; i--)
                System.out.println(num[i]);

    }

}
