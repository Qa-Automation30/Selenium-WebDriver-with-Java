package java_8_Lambda_Streams_Pragmatic_Code_School;

import java_8_Lambda_Streams_Pragmatic_Code_School.consumerRealExample.Student;
import java_8_Lambda_Streams_Pragmatic_Code_School.consumerRealExample.StudentDataBase;
import org.testng.annotations.Test;

import java.util.List;
import java.util.function.Consumer;

public class Test_3_testConsumer {
    /**
     *  What is functional interface ->
     * "An interface that has exactly one abstract method is called functional interface".
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  List of functional interfaces in java8
     *  1) Consumer
     *  2) Predicate
     *  3) Function
     *  4) Supplier
     */
    @Test
    void testConsumer(){
        /**
         * The Consumer interface represents an operation that takes a single argument and performs some processing on it, without returning any result.
         * In other words, it's used when you need to consume or process a value without producing an output.
         */
        //===================================================
        /**
         *  what we have done here -> Consumer is accepting a "String" type here.
         *  The use case is here this is going to accept a String as an input, and then it is going to perform respective operation.
         */
        Consumer<String> consumer = (s)->System.out.println(s.toUpperCase());
        consumer.accept("vivek");
    }

    @Test
    void printStudentNames(){
        /**
         * This is the traditional way or old to print all the names-->
         */
       List<Student> students = StudentDataBase.getAllStudents();
       for (Student std :students){
           System.out.println(std.getName());
       }
        /**
         * With Help of Java 8-->
         */
        System.out.println("-----");
        students.stream().forEach(n->System.out.println(n.getName()));
        /**
         * With Help of Java 8-->
         */
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Consumer<Student> consumer = s->System.out.println(s.getName());
        students.stream().forEach(consumer);
    }
}
