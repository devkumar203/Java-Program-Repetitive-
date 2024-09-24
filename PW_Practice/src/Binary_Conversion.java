import java.util.Scanner;
public class Binary_Conversion {
    /*
    1001 = 9.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //1001
        int ans = 0;
        int pw = 1;
        while(num > 0){
            int unit_digit = num%10; // 1, 0, 0, 1
            ans += (unit_digit*pw); // 1+0+0+8
            num /= 10;  // 100, 10, 1, 0
            pw *= 2;  //2, 4, 8, 16
        }
        System.out.println(ans);  //9
    }
}
