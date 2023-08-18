package Java_8_Streams;

import java.util.ArrayList;
import java.util.List;

public class Test_10 {
    // Flat Map -> Video 115,116
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);

        List<Integer> l3 = new ArrayList<>();
        l3.add(9);
        l3.add(10);
        l3.add(11);
        l3.add(12);
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        List<List<Integer>> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);

        list.stream().forEach(l->System.out.println(l));
        list.stream().flatMap(l->l.stream()).forEach(l->System.out.println(l));
    }
}
