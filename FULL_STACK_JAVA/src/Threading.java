public class Threading extends Thread {
    public void run(){
        //We can change the thread name in run method also ::
        //Thread.currentThread().setName("Phanku");
        System.out.println("Thread task "+Thread.currentThread().getName());
    }
    public static void main(String[] args){
        System.out.println("Hello "+Thread.currentThread().getName());

        Threading ob = new Threading();
        //OR, we can also set the thread name of run method from main method by object::
        ob.setName("Dev Kumar");
        ob.start();

        Threading ob1 = new Threading();
        ob1.setName("Smart Programming");
        ob1.start();
    }
}
