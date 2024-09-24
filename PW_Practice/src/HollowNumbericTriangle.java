public class HollowNumbericTriangle {

    /*
       1
      2 2
     3   3
    4 4 4 4
     */
    public static void main(String[] args){

        for(int i = 1; i <= 4; i++){
           for(int j = 4; j >= i; j--){
               System.out.print(" ");
           }

           for(int k = i; k <= i; k++){
               System.out.print(k+" ");
           }

           for(int l = i-1; l >=1; l--){
               System.out.print(" ");
           }

           for(int n = i-1; n >=1; n--){
               System.out.print("");
           }
            for(int n = i-1; n >=1; n--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
