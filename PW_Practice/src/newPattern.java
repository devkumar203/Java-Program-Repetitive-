public class newPattern {
    /*
     1 2 1 2
     1 2 1 2
     1 2 1 2
     1 2 1 2
     */
    public static void main(String[] args){

        for(int i = 0; i <= 4; i++){
            for(int j = 0; j <= 4; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("2 ");
                }
            }
            System.out.println();
        }
    }
}
