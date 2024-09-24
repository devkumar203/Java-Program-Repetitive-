import java.util.Scanner;
public class PatternAcceptingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice--->(a, b, c, d)");
        int choice = sc.next().charAt(0);
        int num;
        switch (choice){
            case 'a':
                System.out.println("Enter the size: ");
                num = sc.nextInt();
                for(int i = 1; i<=num; i++){
                    for(int j = 1; j <=i; j++){
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                break;

            case 'b':
                System.out.println("Enter the size: ");
                num = sc.nextInt();
                for(int i = 1; i <= num; i++){
                    for(int j = 1; j <=i; j++){
                        System.out.print("  ");
                    }

                    for(int k = 1; k <=num-i+1; k++){
                        System.out.print( k+" ");
                    }
                    System.out.println();
                }
                break;

            case 'c':
                System.out.println("Enter the size: ");
                num = sc.nextInt();
                for(int i = 1; i <=num; i++){
                    for(int j = i; j <= num; j++){
                        System.out.print("  ");
                    }

                    for(int k  =1; k <=i; k++){
                        System.out.print(k+" ");
                    }
                    System.out.println();
                }
                break;

            case 'd':
                System.out.println("Enter the size: ");
                num = sc.nextInt();
                for(int i = num; i>=1; i--){
                    for(int j =1; j <= i; j++){
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
