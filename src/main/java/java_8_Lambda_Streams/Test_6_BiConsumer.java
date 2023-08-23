package java_8_Lambda_Streams;

import java_8_Lambda_Streams.consumerRealExample.Student;
import java_8_Lambda_Streams.consumerRealExample.StudentDataBase;
import org.testng.annotations.Test;

import java.util.List;
import java.util.function.BiConsumer;

public class Test_6_BiConsumer {
    /**
     *  BiConsumer interface is the extension of the Consumer interface.
     *
     *  The BiConsumer interface is an extension of the Consumer interface in Java,
     *  and it's used when you need to perform an operation that takes two input arguments and doesn't return any result.
     *
     *  The "Bi" in BiConsumer stands for "binary," indicating that it deals with two inputs.
     *
     *  The primary difference between Consumer and BiConsumer is the number of input arguments they accept:
     *
     * Consumer<T>: Accepts a single input of type T.
     * BiConsumer<T, U>: Accepts two inputs of types T and U.
     *
     * The BiConsumer interface is part of the java.util.function package and is often used in scenarios where
     * you need to perform some operation that involves two input parameters,
     * such as updating two values in a map, performing actions on pairs of elements, or applying operations on pairs of arguments.
     */
    @Test
    void test(){
        BiConsumer<String,String> biConsumer = (s1,s2)->System.out.println(s1+s2);
        biConsumer.accept("java","8");

        BiConsumer<Integer,Integer> biConsumer1 = (s1,s2)->System.out.println(s1+s2);
        biConsumer1.accept(8,8);
    }
}
