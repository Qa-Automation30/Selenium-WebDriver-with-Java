package JavaLambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test_12 {
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

        // Do behaviour Parameterization for the mapping logic
        list.stream().map(x->x*x).collect(Collectors.toList());
        // Solving here-->
        Function<Integer, Integer> squareOfNumbers = x->x*x;
       List<Integer> resultOfSquare = logicHere(list,squareOfNumbers);
       System.out.println(resultOfSquare);
       //
        Function<Integer, Integer> cubeOfNumbers = x->x*x*x;
        List<Integer> resultOfCube = logicHere(list,cubeOfNumbers);
        System.out.println(resultOfCube);

    }
   static List<Integer> logicHere(List<Integer> list, Function<Integer,Integer> function){
       return list.stream().map(function).collect(Collectors.toList());
    }
}
