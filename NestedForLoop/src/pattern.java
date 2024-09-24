public class pattern {
    public static void main(String[] args){
        /*
         *
         **
         ***
         ****
         *****
         */
//        for(int i = 1; i <=5; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
//        for(int i = 1; i<=5; i++){
//            for(int j = 5; j>=i; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1
         */

//        for(int i = 5; i >=1; i--){
//            for(int j = i; j>=1; j--){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        /*
        5
        5 4
        5 4 3
        5 4 3 2
        5 4 3 2 1
         */
//        for(int i = 5; i >=1; i--){
//            for(int j = 5; j >=i; j--){
//                System.out.print( j+" ");
//            }
//            System.out.println();
//        }

        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        16 17 18 19 20 21
        22 23 24 25 26 27 28
        29 30 31 32 33 34 35 36
        37 38 39 40 41 42 43 44 45
        46 47 48 49 50 51 52 53 54 55
         */
//        int temp =1;
//        for(int i = 1; i<=10; i++){
//            for(int j =1; j<=i; j++){
//                System.out.print(temp++ +" ");
//            }
//            System.out.println();
//        }

        /*
         * |	1	2	3	4	5	6	7	8	9
         ---------------------------------------
         1 |	1	2	3	4	5	6	7	8	9
         2 |	2	4	6	8	10	12	14	16	18
         3 |	3	6	9	12	15	18	21	24	27
         4 |	4	8	12	16	20	24	28	32	36
         5 |	5	10	15	20	25	30	35	40	45
         6 |	6	12	18	24	30	36	42	48	54
         7 |	7	14	21	28	35	42	49	56	63
         8 |	8	16	24	32	40	48	56	64	72
         9 |	9	18	27	36	45	54	63	72	81

         */

        int max = 9;

        for(int i = 1; i <=max; i++){
            if(i==1){
                    System.out.print("*  | \t");

                for(int k = 1; k<=max; k++)
                    System.out.print(k +"\t");

                System.out.println();

                for(int k = 1; k <= max; k++)
                    System.out.print("-----");

                System.out.println("---");

            }

            for(int j = 1; j<=max; j++){
                if(j == 1){
                    System.out.print(i +"  |\t");
                }

                System.out.print((i*j)+"\t");
            }
            System.out.println();
        }
    }
}












