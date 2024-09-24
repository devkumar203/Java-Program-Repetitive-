import java.util.Scanner;
public class MenuDrivenPattern {
    /*
    Write a menu driven program that prompts the user to select one of the four
    triangle pattern(a, b, c or d).
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your choice--->(a, b, c or d)");
        int choice = sc.next().charAt(0);
        int num;

        switch (choice){
            case 'a':
                System.out.println("Enter the size: ");
                num = sc.nextInt();
                for(int i = 1; i <=num; i++){
                    for(int j = 1; j <=i; j++){
                        System.out.print("# ");
                    }
                    System.out.println();
                }
                break;

            case 'b':
                System.out.println("Enter the size: ");
                num = sc.nextInt();
                for(int i = 1; i <=num; i++){
                    for(int j = num; j>=i; j--){
                        System.out.print("# ");
                    }
                    System.out.println();
                }
                break;

            case 'c':
                System.out.println("Enter the size: ");
                num = sc.nextInt();
                for(int i = 1; i <=num; i++){
                    for(int j = 1; j <=i; j++){
                        System.out.print("  ");
                    }

                    for(int k = i; k <=num; k++){
                        System.out.print(" #");
                    }
                    System.out.println();
                }
                break;

            case 'd':
                System.out.println("Enter the size: ");
                num = sc.nextInt();
                for(int i = 1; i <= num; i++){
                    for(int j = i; j <=num; j++){
                        System.out.print("  ");
                    }

                    for(int k = 1; k <=i; k++){
                        System.out.print("# ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}
