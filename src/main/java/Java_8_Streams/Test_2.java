package Java_8_Streams;

import java.util.ArrayList;
import java.util.List;

public class Test_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(11);
        /**
         * Problem statement is here->
         * 1. Check for even number and find the square and print it on console
         */
        // Traditional way to do it.
        for(int i=0;i<numbers.size();i++){
            if((numbers.get(i)%2)==0){
                System.out.println(numbers.get(i)*numbers.get(i));
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // using streams one way -->
        numbers.stream().filter(s->(s%2==0)).forEach((s ->System.out.println(s*s)));
        // using streams 2nd way -->
        numbers.stream().filter(i->i%2==0).map(i->i*i).forEach(i->System.out.println(i));
        /**
         * .filter(s -> (s % 2 == 0)): This is an intermediate operation.
         * It filters the elements of the Stream based on a condition.
         * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
         * .map(i -> i * i): This is another intermediate operation.
         */

    }
}
