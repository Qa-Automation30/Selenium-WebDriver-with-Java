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
        // A Stream is basically a sequence of the elements.
        list.stream().
                filter(num->num%2==0). // Lambda Expressions
                forEach(num->System.out.println("Even number are-->"+num));

        // Now print only the odd numbers in the list
        list.stream().filter(num->num%2!=0).forEach(num->System.out.println("odd number-->"+num));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        // Now print the square of all numbers....
        list.stream().map(n->n*n).forEach(n->System.out.println(n));

        // print the cubes only for odd numbers
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        list.stream().filter(n->n%2!=0).map(n->n*n*n).forEach(System.out::println);
    }
}
