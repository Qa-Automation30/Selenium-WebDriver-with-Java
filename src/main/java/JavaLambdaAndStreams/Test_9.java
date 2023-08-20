package JavaLambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test_9 {
    /**
     * This section is all about Functional Interfaces...
     * @param args
     */
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
         *  When ever we create "x->x%2==0" this kind of lambda so in the background instance of a
         *  Predicate class was created. [So we can write like below code as well]
         *  How to identify that why it is predicate only --> so just go to the definition of "filter"
         *  and check that what king of parameter it is accepting. basically I checked in the documentation so from there
         *  I got to know that filter is accepting Predicate type of parameter
         */
        Predicate<Integer> isEven = x->x%2==0;
        /**
         *  Because Map is accepting "Function<>" so we need to create like this.
         *  You can go to definition of "map" and check over there
         */
        Function<Integer,Integer> square = num->num*num;
        /**
         * Same as for Consumer as well.
         */
        Consumer<Integer> sysOUT = n-> System.out.println(n);
        list.stream().
                filter(isEven).map(square).forEach(sysOUT);

    }
}
