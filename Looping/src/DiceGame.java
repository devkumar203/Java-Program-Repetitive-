import java.util.Scanner;
public class DiceGame {
    /*
    Write a program to roll a dice until a six comes up. Display the outcomes except
    when a one comes up. Also, display the number of iteration it takes.
     */
    public static void main(String[] args){
    int count = 0;

       while(true){
           count++;
           int random = 1 + (int)(Math.random() * 6);
           if(random ==1){
               System.out.println("Skipped");
               continue;
           }else if(random==6){
               System.out.println("Congratulation!, You got "+random);
               break;
           }
           System.out.println(random);
       }
        System.out.println("TOatal iterations :"+count);
    }
}

