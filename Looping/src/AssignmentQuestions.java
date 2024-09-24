import java.util.Scanner;
public class AssignmentQuestions {
    public static void main(String [] args){

//        int y = 2;
//        while(y < 20)
//            if(y%2==0)
//                System.out.println(y++);

//        int z = 2;
//        while(z<20)
//            if((z++)%2==0)
//                System.out.println(z);

//        int n=20;
//        do{
//            System.out.println(n);
//            n = n-3;
//        }while(n>0);

//        int num = 20;
//        while(num>0){
//            num = num-2;
//            if(num == 4)
//                break;
//            System.out.println(num);
//        }
//        System.out.println("Finished");

//        int num = 10;
//        while (num>0){
//            num = num-2;
//            if(num==2)
//                continue;
//            System.out.println(num);
//        }

        /*
        Write a program to input n number of integers and find out:
          i. Number of positive integers
          ii. Number of negative integers
          iii. Sum of positive numbers
          iv. Product of negative number
          v. Average of positive numbers
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of integers: ");
//        int n = sc.nextInt();
//
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int positiveSum = 0;
//        int negativeProduct = 1;
//        int positiveSumCount = 0;
//
//        for(int i = 0; i <n; i++){
//            System.out.println("Enter an integer: ");
//            int number = sc.nextInt();
//
//            if(number >0){
//                positiveCount++;
//                positiveSum +=number;
//                positiveSumCount++;
//            }else if(number < 0){
//                negativeCount++;
//                negativeProduct *= number;
//            }
//        }
//
//        double positiveAverage = 0;
//        if(positiveSumCount >0){
//            positiveAverage = (double) positiveSum/positiveSumCount;
//        }
//
//        System.out.println("Number of positive integers: "+positiveCount);
//
//        System.out.println("Number of negative integers: "+negativeCount);
//
//        System.out.println("Sum of Positive numbers: "+ positiveSum);
//
//        System.out.println("product of negative numbers: "+(negativeCount>0 ? negativeProduct:0));
//
//        System.out.println("Average of positive numbers: "+ positiveAverage);

        /*
        Write a program in java to read a number, remove all zeroes from it, and display the new number. For
        example,
        Sample Input:       45407703
        Sample Output:      454773
         */



        /*
        Write a program to read the number n using the Scanner class and print the
        Tribonacci series: 0,0,1,1,2,4,7,13,24,44,81, ...and so on
        HINT: The Tribonacci series is a generalisation of the Fibonacci sequence
              where each term is the sum of the three preceding terms.
         */

        //Not understandable
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        int sum=0;
//        int a = 0, b = 1, c = 1;
//        System.out.print(a+" "+a+" "+c+" ");
//
//
//      for(int i= 0; i<=num; i++){
//          sum = a+b;
//          System.out.print(sum+" ");
//          a = b+a;
//          b = c;
//          c = sum;
//
//      }

        //Chat-Gpt---------->
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number of terms: ");
                int num = sc.nextInt();

                // Check if the number of terms is valid
                if (num <= 0) {
                    System.out.println("The number of terms should be greater than 0.");
                    sc.close();
                    return;
                }

                // Initialize the first three terms
                int a = 0, b = 0, c = 1;

                // Print the initial terms based on the number of terms
                if (num >= 1) {
                    System.out.print(a + " ");
                }
                if (num >= 2) {
                    System.out.print(b + " ");
                }
                if (num >= 3) {
                    System.out.print(c + " ");
                }

                // Generate and print the remaining terms
                for (int i = 3; i < num; i++) {
                    int sum = a + b + c; // Compute the next term
                    System.out.print(sum + " ");
                    // Update values
                    a = b;
                    b = c;
                    c = sum;
                }

                sc.close(); // Close the scanner
            }
        }
