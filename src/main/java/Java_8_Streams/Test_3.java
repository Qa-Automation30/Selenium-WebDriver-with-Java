package Java_8_Streams;

import java.util.ArrayList;
import java.util.List;

public class Test_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(12);
        numbers.add(6);
        numbers.add(8);
        numbers.add(32);
        /**
         * Problem Statement is ->
         * Check for even numbers, ensure that number should be > 5 , find the Square and add 2 to that , print it on the console
         */
       numbers
                .stream()
                .filter(i->i%2==0)
                .filter(i->i>5)
                .map(i->i*i)
                .map(i->i+2)
                .forEach(i->System.out.println(i));
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        numbers
                .stream()
                .filter(i->i%2==0 && i>5)
                .map(i->i*i)
                .map(i->i+2)
                .forEach(i->System.out.println(i));
    }
}
