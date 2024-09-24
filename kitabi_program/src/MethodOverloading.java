//public class MethodOverloading {
//
//    public static int max(int num1, int num2){
//        if(num1 > num2){
//            return num1;
//        }else
//            return num2;
//    }
//
//    public double max(double num1, double num2){   //here i checked that without static can we return the value by using object.Ans= yes
//                                                   //But you cant pass the value by Class name without putting static in method prototype.
//                                                    //You can see the error.
//        if(num1 > num2){
//            return num1;
//        }else
//            return num2;
//    }
//
//    public static void main(String[] args){
//        MethodOverloading ob1 = new MethodOverloading();
//        System.out.println(ob1.max(2, 5));
//
//        System.out.println(ob1.max(2.5, 7.9));
//        System.out.println(MethodOverloading.max(2.5, 3.6));//
//    }
//}
