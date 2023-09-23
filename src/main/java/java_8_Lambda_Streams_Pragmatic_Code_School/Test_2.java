package java_8_Lambda_Streams_Pragmatic_Code_School;

import java.util.function.BinaryOperator;

public class Test_2 {

       public static void main(String [] args){
           /**
            * 1st way to write the sum method
            */
           int addition = sum(2,3);
           System.out.println(addition);

           /**
            * 2nd way to write the sum method with help of lambda
            */
           BinaryOperator<Integer> sum = (a,b)-> a + b;
           sum.apply(10,10);
           /**
            * 3rd way to write the sum method with help of lambda
            */
           BinaryOperator<Integer> sum1 = Integer::sum;
           sum1.apply(10,10);
       }
       public static int sum(int a, int b){
           return a+b;
       }



}
