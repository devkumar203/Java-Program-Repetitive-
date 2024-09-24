import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args){
        List<Integer> list1 = List.of(2,4,5,0,2,1,22);

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        List<Integer> list3 = Arrays.asList(23, 567,12,677,24);

        List<Integer> listEven = new ArrayList<>();
        for(Integer i: list1){
            if(i%2 == 0){
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);
    }
}
