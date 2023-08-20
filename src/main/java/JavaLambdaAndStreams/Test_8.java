package JavaLambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test_8 {
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

        // Create an even number list from the above list-->
       List<Integer> newList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
       System.out.println(newList);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Problem -> Create a new List with lengths of all course titles
        List<String> list1 = new ArrayList<>();
        list1.add("Spring");
        list1.add("Spring boot");
        list1.add("API");
        list1.add("Microservices");
        list1.add("AWS");
        list1.add("PCF");
        list1.add("Azure");
        list1.add("DOCKER");
        list1.add("PostMan");

       List<Integer> len = list1.stream().map(l->l.length()).collect(Collectors.toList());
       System.out.println(len);

    }
}
