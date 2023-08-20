package JavaLambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test_11 {
    /**
     * Doing behaviour Parameterization with Functional programing
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

        // Print the even numbers on console
        list.stream().filter(x->x%2==0).forEach(System.out::println);
        // Print the odd numbers on console
        list.stream().filter(x->x%2!=0).forEach(System.out::println);
        /**
         * Now observe that in both the lines some code is duplicate.
         * So what is it -> it is just a logic only which is written inside the "filter" method.
         * So we can convert both the logic in respective variables , which we have done below.
         */
        Predicate<Integer> evenNumber = x->x%2==0;
        Predicate<Integer> oddNumber = x->x%2!=0;
        /**
         * Now you can call the method, and it looks like more generic
         */
        List<Integer> evenNumbers = Test_11.filterNumbers(list,evenNumber);
        System.out.println(evenNumbers);
        List<Integer> oddNumbers = Test_11.filterNumbers(list,oddNumber);
        System.out.println(oddNumbers);
        }
    /**
     * Created a common method which is responsible for filtering the number
     * as per Predicate passed in the function calling
     * @param list
     * @param predicate
     * @return
     */
       static List<Integer> filterNumbers(List<Integer> list , Predicate<Integer> predicate){
           return list.stream().filter(predicate).collect(Collectors.toList());
        }
    }

