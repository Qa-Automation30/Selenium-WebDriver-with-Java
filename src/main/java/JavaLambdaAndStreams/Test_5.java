package JavaLambdaAndStreams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test_5 {

    @Test
    void test() {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(31);
        list.add(3);
        list.add(41);
        list.add(14);
        list.add(57);
        list.add(58);
        list.add(90);
        list.add(14);
        list.add(57);
        list.add(58);
        list.add(90);

        // how to find the distinct number is list--> [means remove the duplicates from the list]
        /**
         * We can collect all the distinct into a new list and print it--.
         */
        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
        /**
         * another way We can just print the distinct numbers...
         */
        list.stream().distinct().forEach(n->System.out.println(n));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // how to sort the list and print it in console
        list.stream().sorted().forEach(n->System.out.println(n));
    }
}
