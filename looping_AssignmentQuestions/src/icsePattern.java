import java.util.Scanner;
public class icsePattern {
        /*
        Write a program to display the following patterns as per the user's choice.
                Pattern 1            Pattern 2
                I                            I
                  C                        C
                    S                    S
                      E                E
         */

    // Ask the user to choose a pattern
//    public static void main(String[] args) {
//        System.out.println("Enter 1 for Pattern 1 or 2 for Pattern 2:");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//
//        switch (choice) {
//            case 1:
//                // Display Pattern 1
//                for (int i = 0; i < 4; i++) {
//                    for (int j = 0; j < i; j++) {
//                        System.out.print(" ");
//                    }
//                    switch (i) {
//                        case 0:
//                            System.out.println("I");
//                            break;
//                        case 1:
//                            System.out.println("C");
//                            break;
//                        case 2:
//                            System.out.println("S");
//                            break;
//                        case 3:
//                            System.out.println("E");
//                            break;
//                    }
//                }
//                break;
//
//            case 2:
//                // Display Pattern 2
//                for (int i = 0; i < 4; i++) {
//                    for (int j = 4; j > i + 1; j--) {
//                        System.out.print(" ");
//                    }
//                    switch (i) {
//                        case 0:
//                            System.out.println("I");
//                            break;
//                        case 1:
//                            System.out.println("C");
//                            break;
//                        case 2:
//                            System.out.println("S");
//                            break;
//                        case 3:
//                            System.out.println("E");
//                            break;
//                    }
//                }
//                break;
//
//            default:
//                System.out.println("Invalid choice!");
//     }
//   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                        switch (i) {
                            case 0:
                                System.out.println("I");
                                break;
                            case 1:
                                System.out.println("C");
                                break;
                            case 2:
                                System.out.println("S");
                                break;
                            case 3:
                                System.out.println("E");
                                break;
                    }
                }
                break;

            case 2:

                for(int i = 0; i< 4; i++){
                    for(int j = 4; j>i; j--) {
                        System.out.print(" ");
                    }

                        switch (i){
                            case 0:
                                System.out.println("I");
                                break;

                            case 1:
                                System.out.println("C");
                                break;

                            case 2:
                                System.out.println("S");
                                break;

                            case 3:
                                System.out.println("E");
                    }
                }
                break;

            default:
                System.out.println("You chose Invalid choice!");
        }
    }
}
