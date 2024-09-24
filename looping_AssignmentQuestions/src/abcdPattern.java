import java.util.Scanner;
public class abcdPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 5; i >=1; i--) {
                    for (int j = 1; j <= i; j++) {
                        switch (j){
                            case 1:
                                System.out.print("A");
                                break;

                            case 2:
                                System.out.print("B");
                                break;

                            case 3:
                                System.out.print("C");
                                break;

                            case 4:
                                System.out.print("D");
                                break;

                            case 5:
                                System.out.print("E");
                                break;
                        }
                    }
                    System.out.println();
                }
                break;

            case 2:

                for(int i = 1; i <=4; i++){
                    for(int j = 1; j <=i; j++){
                        switch (i){

                            case 1:
                                System.out.print("B");
                                break;

                            case 2:
                                System.out.print("L");
                                break;

                            case 3:
                                System.out.print("U");
                                break;

                            case 4:
                                System.out.print("E");
                                break;
                        }
                    }
                    System.out.println();
                }


            default:
                System.out.println("You chose Invalid choice!");
        }
    }
}
