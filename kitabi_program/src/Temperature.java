//import jdk.swing.interop.SwingInterOpUtils;
//
//public class Temperature {
//    public double ToCeclsius(double temperatureF)
//    {
//        double temperatureC = (temperatureF - 32)*5.0/9.0;
//        return temperatureC;
//    }
//
//    public double ToFahrenheit(double temperatureC)
//    {
//        double temperatureF = (temperatureC * 1.8)+32;
//        return temperatureF;
//    }
//
//    public static void main(String args[]){
//        Temperature ob = new Temperature();
//
//        System.out.println(ob.ToCeclsius(56));
//        System.out.println(  ob.ToFahrenheit(37.4));
//    }
//}

public class Temperature{

    public void ToCelcius(double temperatureF){
        double temperatureC = (temperatureF -32)*5.0/9.0;
        System.out.println(temperatureC);
    }

    public void ToFahrenheit(double temperatureC){
        double temperaureF = (temperatureC *1.8)+32;
        System.out.println(temperaureF);
    }

    public static void main(String[] args){
        Temperature ob = new Temperature();

        ob.ToCelcius(23);
        ob.ToFahrenheit(13);
//        System.out.println(ob.ToCelcius(23));
//        System.out.println(ob.ToFahrenheit(13));
    }
}
