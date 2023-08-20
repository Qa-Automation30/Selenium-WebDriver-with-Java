package JavaLambdaAndStreams;

import java.util.ArrayList;
import java.util.List;

public class Test_2 {
    public static void main(String args[]) {
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
        /**
         * Now print only the even numbers from the list
         */
        list.stream().
                filter(num->num%2==0).
                forEach(num->System.out.println("Even number are-->"+num));
    }
}
