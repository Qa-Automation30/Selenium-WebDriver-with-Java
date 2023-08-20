package JavaLambdaAndStreams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test_6 {
    @Test
    void test() {
        List<String> list = new ArrayList<>();
        list.add("Spring");
        list.add("Spring boot");
        list.add("API");
        list.add("Microservices");
        list.add("AWS");
        list.add("PCF");
        list.add("Azure");
        list.add("DOCKER");
        list.add("PostMan");
        list.add("Spring");
        list.add("Spring boot");
        list.add("API");
        list.add("Microservices");
        list.add("AWS");
        list.add("PCF");
        list.add("Azure");
        list.add("DOCKER");
        list.add("PostMan");

        //1-> sort the courses->
        /**
         * Imp point is here that "sorted" method -> sort the elements as per it's structure.
         * as here we have "String" -> so "Sorted" method "sort" the "Strings" in "ascending" order by "default".
         * So how it does that -> by its natural order.  so both the below statements are same
         * Comparator.naturalOrder()  -> This is optional in case you want natural sort
         */
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        //--------------------------------------------------------------------------------
        System.out.println(list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));

        //2 -> get the distinct courses->
        System.out.println(
                list.stream().distinct().collect(Collectors.toList())
        );
    }
}
