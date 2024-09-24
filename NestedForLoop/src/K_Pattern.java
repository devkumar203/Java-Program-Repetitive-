public class K_Pattern {
    public static void main(String[] args){
        /*
            Write a program to display the following pattern
            @ @ @ @ @
            @ @ @ @
            @ @ @
            @ @
            @
            @
            @ @
            @ @ @
            @ @ @ @
            @ @ @ @ @
        */
        for(int i = 1; i<=7; i++){
            for(int j = 7; j >=i; j--){
                System.out.print("@ ");
            }
            System.out.println();
        }

        for(int i = 1; i<=7; i++){
            for(int j = 2; j <=i; j++){
                System.out.print("@ ");
            }
            System.out.println();
        }

    }
}
