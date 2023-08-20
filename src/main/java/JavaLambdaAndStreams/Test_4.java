package JavaLambdaAndStreams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test_4 {
    @Test
    void test(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        // Add all these numbers -->
        /**
         *  As we have open the Stream and our next step is just to combine the sum into one step ==> One value
         */
        System.out.println(list.stream().reduce(0,(a, b) -> a+b));
    }
}
