package JavaLambdaAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_1 {
    public static void main(String args[]){

        List<Integer> list = new ArrayList<>();
        list.add(12);list.add(13);list.add(65);list.add(11);list.add(14);list.add(98);
        /**
         * This is also a way to define the list. [Written inside the for loop]
         */
        // This is the structured way to write the code.
        for(int a :Arrays.asList(12,13,1,2,4,11,45,98,32,22)){
            System.out.println(a);
        }
        System.out.println("~~~~~~~~~~~~~~~");
        for(int num : list){
            System.out.println(num);
        }
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("~~~~~~~~~~~~~~~");
        // This is the functional Approach to write the code, to print each number from the list
        list.stream().forEach(num->System.out.println(num));
        System.out.println("This is ~~~~~~~~~~~~~~~");
        // This is the functional Approach to write the code, to print each number from the list and used the Method reference, inside the for Each loop
        list.stream().forEach(System.out::println);
    }

}
