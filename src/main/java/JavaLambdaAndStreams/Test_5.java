package JavaLambdaAndStreams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test_5 {

    @Test
    void test() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(9);

        // how to find the distinct number is list-->
        /**
         * We can collect all the distinct into a new list and print it--.
         */
        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
        /**
         * another way We can just print the distinct numbers...
         */
        list.stream().distinct().forEach(n->System.out.println(n));
    }
}
