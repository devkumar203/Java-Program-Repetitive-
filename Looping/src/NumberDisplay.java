public class NumberDisplay {
    public static void main(String[] args){
        //Write a java program to display the following series:
        //  1, 2, 4, 5, 7, 8, 10, ...19(HINT: Skip number divisible by 3)


        for(int i = 1; i<20; i++){
            if(i % 3 ==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
