public class SolvedProgrammingExercise {
    public static void main(String[] args){
        //Write a program in java to display the powers of 2 from 1 to 10.

          //My logic using for and if -------->
//        int num = 2;
//        for(int i = 1; i <= 10; i++){
//            if(i==1)
//            System.out.println("2^ "+i+" = "+num);
//            if(i >= 2) {
//                System.out.println("2^ " + i + " = " + (num = (num * 2)));
//            }
//        }

        //ChatGpt(Very Easy)
//        for(int i = 1; i <=10; i++){
//            int powerOfTwo = (int)Math.pow(2,i);
//            System.out.println("2 ^"+ i+" = "+powerOfTwo);
//        }

        //Bookish logic
        int power = 2;
        for(int i=1; i <=10; i++, power *= 2){
            System.out.println("2^"+i+" = "+power);
        }

    }
}
