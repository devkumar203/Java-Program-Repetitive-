import java.util.Scanner;
public  class GraduationYear {
    /*
    Write a program to accept the year of graduation from school as an integer value from the user.
    Using the Binary Search technique on the sorted array of integers given below, output the message
    "Record exits" if the value input is located in the array. If not, output the message "Record does
    not exist".(1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010)
     */
    public static void main(String[] args) {
        int[] gradyear = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of your graduation: ");
        int year = sc.nextInt();

        boolean recordExist = false;

        for(int i = 0; i < gradyear.length; i++){
            if(year == gradyear[i]){
                recordExist = true;
                System.out.println("Record exist");
                break;
            }
        }
        if (!recordExist){
            System.out.println("Record doesn't exist");
        }
    }
}
