package JavaLambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Test_10 {
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

        // Find Functional Interface behind the "reduce" method. Create an implementation for the Functional Interface.
        BinaryOperator<Integer> accumulator1 = (a, b)->(a+b);

        BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };
        System.out.println(
                list.stream().reduce(0,accumulator1)
        );

    }
}
