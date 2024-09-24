public class PassbyRefernce {

    int num;
    public void Compute(PassbyRefernce object){
        object.num = object.num*2;
        System.out.println("Value in the method Call: "+object.num);
    }

    public void TestCompute(){
        PassbyRefernce ob = new PassbyRefernce();
        ob.num = 5;
        System.out.println("Original Value :"+ob.num);
        Compute(ob);
        System.out.println("Value after method Call: "+ob.num);
    }

    public static void main(String args[]){
        PassbyRefernce mainobj = new PassbyRefernce();
        mainobj.TestCompute();
    }
}
