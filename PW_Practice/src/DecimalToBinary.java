import java.util.Scanner;
public class DecimalToBinary {
    //13 = 1101
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //13
        int binaryAns = 0;
        int pw = 1;
        while (num > 0) {
            int digit = num%2; // 1
            binaryAns +=  (digit*pw);
            pw *=10;
            num = num/2;
        }

        System.out.println(binaryAns);
    }
}
