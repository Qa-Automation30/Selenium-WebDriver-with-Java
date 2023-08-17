package Java_8_Streams;

import java.util.ArrayList;
import java.util.List;

public class Test_1 {
    //Java's Stream API
    public static void main(String [] args){
        List<String> list = new ArrayList<>();
        list.add("Infy");
        list.add("TCS");
        list.add("Oracle");
        list.add("IBM");
        list.add("EY");
        /**
         * 1st -> Can you print all the values of the list
         */
        // Traditional way to print the list
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("==================================================");
        // Write the same above code via Streams-->
        list.stream().forEach(s->System.out.println(s));
        /**
         * .stream(): This is a "method" call on the list object
         * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
         * The stream() method is part of the Stream API introduced in Java 8.
         * It's used to convert a collection (in this case, a List) into a stream.
         * A stream is a sequence of elements that you can process in a functional-style manner.
         * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
         * .forEach(s -> System.out.println(s)): This is another method call on the stream produced by the previous step.
         * The forEach() method is used to iterate over each element of the stream and perform a specified action on each element.
         * In this case, the action is defined using a lambda expression: s -> System.out.println(s).
         *
         * "s" is the parameter of the lambda expression, representing an individual element from the stream.
         * System.out.println(s) is the action performed on each element. It prints the element (s) to the standard output (usually the console).
         */
    }
}
