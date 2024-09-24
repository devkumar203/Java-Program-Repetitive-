import com.sun.tools.jconsole.JConsoleContext;

public class sales {
    public static void main(String args[]){

        int price[] = {250, 645, 300, 900, 50};
        double offer;
        for(int i  =0 ; i< price.length; i++){
            offer = (float) (price[i]*0.1);
            price[i] =  (int)(price[i] - offer);
            System.out.println(price[i]);
        }

    }
}
