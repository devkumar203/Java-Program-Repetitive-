public class ArrayInit {
    public static void main(String[] args){
        /*
        Room No.         Capacity
        *********        *********
        0                35
        1                30
        2                20
        3                25
        4                45
         */
        System.out.println("Room No.\tCapacity");
        System.out.println("********\t*********");
        int room[] = {35, 30, 20, 25, 45};
        for(int i = 0; i <5; i++){
            System.out.println(i+"\t\t\t"+room[i]);
        }
    }
}
