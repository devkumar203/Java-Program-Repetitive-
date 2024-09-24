import java.util.Scanner;
public class Question4 {
    public static void main(String[] args){

        /*
        8  88  888  8888  88888  888888
         */
//        for(int i = 1; i <=6; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("8");
//            }
//            System.out.print("  ");
//        }

//        int sum = 0;
//        for(int i = 0; i<=10; i++){
//            for(int j = 0; j <=10; j++){
//                sum +=i;
//            }
//        }
//        System.out.println(sum);

//        int sum = 0;
//        for(int i = 1; i<=3; i++){
//            for(int j = 1; j <= 3; j++){
//                sum = sum +(i+j);
//            }
//        }
//        System.out.print(sum);



      int choice =0, num;
      Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 for a triangle and type 2 for an inverted " +
                "triangle: ");
         choice = sc.nextInt();

         switch (choice){
             case 1:
                 System.out.println("Enter the number of terms: ");
                 num = sc.nextInt();
                 for(int i = 1; i<=num; i++){
                     for(int j = 1; j <=i; j++){
                         System.out.print(i+" ");
                     }
                     System.out.println();
                 }
                 break;

             case 2:
                 System.out.println("Enter the number of terms: ");
                 num = sc.nextInt();
                 for(int i = num; i>=1; i--){
                     for(int j = i; j>=1; j--){
                         System.out.print(i+" ");
                     }
                     System.out.println();
                 }
                 break;
             default:
                 System.out.println("Invalid choice!");
         }
    }
}
