public class PassbyValue {

    int num;
    public void Compute(int n) {
        n = n * 2;
        System.out.println("Value in the method call: " + n);
    }


    public void ToCompute() {

         num = 5;
        System.out.println("Original Value :" + num);
        Compute(num);
        System.out.println("Value after method call: " + num);
    }

    public static void main(String[] args){
        PassbyValue ob = new PassbyValue();
        ob.ToCompute();
    }
}
