package JavaLambdaAndStreams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test_7 {
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

        // Now here the problem is, if you don't want to sort in natural order, but you want to do it in reverse-->
        System.out.println(
                list.stream().
                        sorted(Comparator.reverseOrder()).
                        collect(Collectors.toList())
        );
        //so now I want to sort course name by its length-->
        System.out.println(
                list.
                        stream().
                        sorted(
                                Comparator.comparing(str->str.length())).
                        collect(Collectors.toList())
        );


    }

}
