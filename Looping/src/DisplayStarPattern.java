public class DisplayStarPattern {
    public static void main(String[] args){
        /*
        Write a program in java to display the star pattern shown below:
        1*
        2**
        3***
        4****
        5*****
         */
        String star = "*";
        for(int i = 1; i<=5; i++, star = star+"*" ){
            System.out.println(i+""+star);
        }



    }
}
