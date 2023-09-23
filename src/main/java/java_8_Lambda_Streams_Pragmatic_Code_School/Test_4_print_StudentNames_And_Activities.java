package java_8_Lambda_Streams_Pragmatic_Code_School;

import java_8_Lambda_Streams_Pragmatic_Code_School.consumerRealExample.Student;
import java_8_Lambda_Streams_Pragmatic_Code_School.consumerRealExample.StudentDataBase;
import org.testng.annotations.Test;

import java.util.List;
import java.util.function.Consumer;

public class Test_4_print_StudentNames_And_Activities {
    @Test(enabled = false)
    void print_StudentNames_And_Activities(){
        /**
         * This is the traditional way or old to print all the names-->
         */
        List<Student> students = StudentDataBase.getAllStudents();
        for (Student std :students){
            System.out.println(std.getName() +"---"+ std.getActivities());
        }
        /**
         * With Help of Java 8-->
         */
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Consumer<Student> getName = s->System.out.print(s.getName()+"--");
        Consumer<Student> getActivities = a->System.out.println(a.getActivities());
        students.stream().forEach(getName.andThen(getActivities));   // TODO -> This concept is called consumer chaining
    }
    /**
     * Print only those Students names and activities whose grade is grater then or equal to 3.
     */
    @Test
    void test(){
        Consumer<Student> getName = s->System.out.println(s.getName());
        Consumer<Student> getActivities = s->System.out.println(s.getActivities());
        List<Student> students = StudentDataBase.getAllStudents();
        students.stream().filter(s->s.getGradeLevel()>=3).forEach(getName.andThen(getActivities)); // TODO -> This concept is called consumer chaining
    }
}
