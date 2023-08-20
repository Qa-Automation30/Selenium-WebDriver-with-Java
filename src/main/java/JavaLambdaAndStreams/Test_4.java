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
        // 1st way to write this [reduce is the main key here]
        int sum = list.stream().reduce(0,(a, b) -> a+b);
        System.out.println(sum);
        // 2nd way to write this
        System.out.println(list.stream().reduce(0,(a, b) -> a+b));

        // problem -> Square every number in a list and find the sum of Squares
       int sum1 = list.stream().map(n->n*n).reduce(0,(x, y)->x+y);
       System.out.println(sum1);
       //problem -> Cube every number in a list and find the sum of cubes
        int sum2 = list.stream().map(n->n*n*n).reduce(0,(x,y)->(x+y));
        System.out.println(sum2);
        //problem -> find sum of odd numbers in list
       int sum3 = list.stream().filter(n->n%2!=0).reduce(0,(x,y)->(x+y));
       System.out.println(sum3);
    }
}
