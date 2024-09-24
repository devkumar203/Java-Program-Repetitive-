//import java.util.Scanner;
public class Leap_yearProblem {
    //Write a program in java to input year in four digit format(yyyy) and determine
    // if it is a leap year.

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter year in yyyy format: ");
//        int year = sc.nextInt();
//        if(IsLeapYear(year)){
//            System.out.println(year + " is a leap year.");
//        }else {
//            System.out.println(year + " not a leap year.");
//        }
//
//    }
//
//     static boolean IsLeapYear(int year) {
//        boolean leapyear  = false;
//        if(((year %4 ==0) && !(year/100==0)) || (year % 400==0))
//            leapyear = true;
//        else
//            leapyear = false;
//
//        return leapyear;

        int year = 2020;
        if(year %4==0){
            if(year %100==0){
                if(year%400==0){
                    System.out.println("leap year.");
                }else{
                    System.out.println("not a leap year.");
                }
            }else{
                System.out.println("leap year.");
            }
        }else{
            System.out.println("not a leap year.");
        }

//        int year= 2020;
//        if((year % 4==0) && (year%100==0) && (year%400==0)){
//            System.out.println("leap year");
//        }else{
//            System.out.println("Not a leap year.");
//        }
    }
}
