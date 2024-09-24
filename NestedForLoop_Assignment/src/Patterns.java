public class Patterns {
    /*
    Write a program in java to display the following patterns.
     */
    public static void main(String[] args) {

        /*
        i) 1
           2 3
           4 5 6
           7 8 9 10
           11 12 13 14 15

         */
//        int count = 0;
//        for(int i = 1; i<=5; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print((count = count + 1)+" ");
//            }
//            System.out.println();
//        }

        /*
        ii) 1 * * * *
            * 2 * * *
            * * 3 * *
            * * * 4 *
            * * * * 5
         */
//        for(int i = 1; i <=5; i++){
//            for(int j = 1; j <=i; j++){
//
//                if(i ==j){
//                    System.out.print(i+" ");
//                }else
//                    System.out.print("* ");
//            }
//
//            for(int k = 4; k>=i; k--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*
        iii) #
             * *
             # # #
             * * * *
             # # # # #

         */
//        for(int i = 1; i<=5; i++){
//            for(int j = 1; j <=i; j++){
//                if(i%2==0) {
//                    System.out.print("* ");
//                }else
//                    System.out.print("# ");
//            }
//            System.out.println();
//        }

        /*
        iv) 1 * * * *
            2 2 * * *
            3 3 3 * *
            4 4 4 4 *
            5 5 5 5 5
         */
//        for(int i = 1; i <=5; i++){
//            for(int j = 1; j <=i; j++){
//                System.out.print(i+" ");
//            }
//
//            for(int k = 4; k >=i; k--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*
        v)  $ $ $ $ 5
            $ $ $ 4
            $ $ 3
            $ 2
            1
         */
//        for(int i = 5; i >=1; i--){
//            for(int j = 1; j<=i; j++){
//                if(i==j){
//                    System.out.print(j+" ");
//                }else
//                    System.out.print("$ ");
//            }
//            System.out.println();
//        }

        /*
        vi.A B C D E
           A B C D
           A B C
           A B
           A
         */

//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//
//                switch (j) {
//                    case 1:
//                        System.out.print("A ");
//                            break;
//                    case 2:
//                        System.out.print("B ");
//                            break;
//                    case 3:
//                        System.out.print("C ");
//                            break;
//                    case 4:
//                        System.out.print("D ");
//                        break;
//                    case 5:
//                        System.out.print("E ");
//                        break;
//                    default:
//                        System.out.print(j + " ");
//                }
//            }
//            System.out.println();
//        }
// ------------------------OR-------------------------
                // Number of rows
//                int rows = 5;
//
//                // Iterate through each row
//                for (int i = rows; i >= 1; i--) {
//                    // Print characters in each row
//                    for (int j = 1; j <= i; j++) {
//                        // Print characters from 'A' to 'E'
//                        System.out.print((char) ('A' + j - 1) + " ");
//                    }
//                    // Move to the next line
//                    System.out.println();
//                }


                /*
                vii) 5 4 3 2 1
                     4 3 2 1
                     3 2 1
                     2 1
                     1
                 */
//                for (int i = 5; i >=1; i--){
//                    for(int j = i; j >=1; j--){
//                        System.out.print(j+" ");
//                    }
//                    System.out.println();
//                }

        /*
        viii)  I
               I C
               I C S
               I C S E
         */
//                for(int i= 1; i <=4; i++){
//                    for(int j = 1; j<=i; j++){
//
//                        switch (j){
//                            case 1:
//                                System.out.print("I ");
//                                break;
//
//                            case 2:
//                                System.out.print("C ");
//                                break;
//
//                            case 3:
//                                System.out.print("S ");
//                                break;
//
//                            case 4:
//                                System.out.print("E ");
//                                break;
//
//                            default:
//                            System.out.print(j+" ");
//                        }
//                    }
//                    System.out.println();
//                }

        /*
        ix) 1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */
//        for(int i = 5; i >=1; i--){
//            for(int j = 1; j <=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//
//        for(int i = 2; i <= 5; i++){
//            for(int j = 1; j <=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        /*
        x)  1 2 3 4 5
            2 3 4 5
            3 4 5
            4 5
            5
            4 5
            3 4 5
            2 3 4 5
            1 2 3 4 5
         */
//        int num = 5;
//        for(int i = 1; i<=num; i++){
//            for(int j = i; j <= num; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//
//        for(int i = num-1; i >=1; i--){
//            for(int j = i ; j <= num; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
    }
}

