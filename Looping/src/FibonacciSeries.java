public class FibonacciSeries {
    public static void main(String[] args){

//        //While loop--------->
//        int num = 0, numnext = 1;
//        int sum;
//        System.out.println("Fibonacci series is:");
//        System.out.println(num + " ");
//        System.out.println(numnext+" ");
//        sum = num + numnext;
//
//        while(sum <= 200){
//            System.out.println(sum+" ");  //0 1 1 2 3 5
//            num = numnext;
//            numnext = sum;
//            sum = num + numnext;
//        }

        //For loop---------->
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);


        for(int c = 0; c<=200-c; c++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
