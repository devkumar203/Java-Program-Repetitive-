import jdk.swing.interop.SwingInterOpUtils;

public class ArrayLength {
    /*
    Array length is: 8
    C
    O
    M
    P
    U
    T
    E
    R
     */

    public static void main(String[] args){
        char ch[] = {'C', 'O', 'M', 'P', 'U', 'T', 'E', 'R'};

        System.out.println("Array is "+ ch.length);
        for(int i = 0; i < ch.length; i++){
            System.out.println(ch[i]);
        }
    }
}
