public class PowerOfTwo {
    public static void main(String[] args){
        //Write a program in java to display the powers of 2 from 1 to 10

        int pow =2;
        for(int i = 1; i<=10; i++,pow = pow *2){
            System.out.println("2^"+i+"="+pow);
        }
    }
}
