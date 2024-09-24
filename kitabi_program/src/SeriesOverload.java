
/*
Design a class to overload a function SumSeries() as follows:
   i. void SumSeries(int n, double x)- with one integer argument and one double argument to find and display the sum of the series
      given below:
      s= x/1-x/2+x/3-x/4+x/5......... to n terms

   ii. void SumSeries()- To find and display the sum of the following series:
      s = 1+(1x2)+(1x2x3)+.......+(1x2x3x4................x20)
*/

public class SeriesOverload {
    public void sumSeries(int n, double x){
        double s = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 ==1){
                s = s +(x/i);
            }else
                s = s -(x/i);
        }
        System.out.println(s);
    }

    public void SumSeries(){
        long sum = 0;

        for(int i = 1; i <=20; i++){
            long product = 1;
            for(int j = 1; j<=i; j++){
                product = product *j;
            }
            sum = sum + product;
        }
        System.out.println("Sum of series = "+sum);
    }

    public static void main(String[] args){
        SeriesOverload object = new SeriesOverload();
        object.sumSeries(10,2.0);
        object.SumSeries();
    }
}
