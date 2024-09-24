
interface Age{
    int x = 21;
    void getAge();
}

public class AnonymousClass {


        public static void main(String[] args){
            Age obj1 = new Age() {
                @Override
                public void getAge() {
                    System.out.println(x);
                }
            };
            obj1.getAge();
        }

    }
