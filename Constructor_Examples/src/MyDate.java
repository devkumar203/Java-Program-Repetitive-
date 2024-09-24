public class MyDate {
    /*
    Write a class MyDate in java with the following details:
    Instance Variable/Data Members:
    day    : stores the day
    month  : stores the month
    year   : stores the year

    Constructor Methods:
    Default constructor: initialises instance variables as day = 1, month = 1, year = 1900
    Parameterised constructor: initialises instance variables with the provided initial values
    Write a main method to create an object of the class and call the above member methods.
     */

    int day, month, year;
    MyDate(){
        day = 1;
        month = 5;
        year = 2024;
    }

    MyDate(int dy, int mth, int yr){
        day = dy;
        month = mth;
        year = yr;
    }

    public static void main(String[] args){
        MyDate mydate1 = new MyDate();
        System.out.println("Date is: "+mydate1.day+"/"+mydate1.month+"/"+mydate1.year);

        MyDate mydate2 = new MyDate(23, 9, 2024);
        System.out.println("Date is: "+mydate2.day+"/"+mydate2.month+"/"+mydate2.year);
    }
}
